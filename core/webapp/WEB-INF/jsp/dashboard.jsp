<%@page import="com.base.common.model.User"%>
<%@include file="header.jsp" %>	

<div class="register bc">
	Dashboard<br/><br/>
	<%User u =(User)request.getAttribute("user"); %>
	<%User u1 = (User)session.getAttribute("user");
	String ssid = session.getId();%>
	Request User :
	<%if(u!=null){%>
		<%=u.toString()%>
	<%}%>
	<br/><br/>
	Session User : <%=u1!=null ? (u1.toString()+" " + ssid): "User not in session" %> <br/><br/>
	Session Id : <%=(session.isNew()? "New ::" : "Old :: ") + session.getId()%>
</div>


<%@include file="footer.jsp" %>