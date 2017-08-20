<%@page import="com.base.common.model.User"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Collection"%>

<%@include file="header.jsp" %>	
	<%
	Collection<User> userList = (Collection<User>)request.getAttribute("userList");
	 Iterator<User> userIterator =null;
	 if(userList!=null){
		userIterator = userList.iterator();
	 }
	%>
<div class="userlist bc" >
	<%if(userIterator!=null){%>
	<table> 
	<tr>
		<th id="nm">User ID</th>
	    <th id="nm">User Name</th>
	    <th>Password</th>
	    <th>Email</th>
	    <th id="fn">First Name</th>
	    <th id="ln"> Last Name</th>    
	    <th>Gender</th>
	    <th>Traveler</th>
	    <th>Delete</th>
	  </tr>     
	  <%while(userIterator.hasNext()){ 
	  	User tuser = userIterator.next();
	  %>
	 <tr>
	    <td/><%=tuser.getId()%></td/>
	    <td/><%=tuser.getUserName()%></td/>
	    <td/><%=tuser.getPassword()%></td/>
	    <td/><%=tuser.getEmail()%></td/>
	    <td/><%=tuser.getFirstName()%></td/>
	    <td/><%=tuser.getLastName()%></td/> 
		<td/><%=tuser.getGender()%></td/>   
	    <td/><%=tuser.getTraveler()%></td/>
	    <td/><a href="<%=request.getContextPath()+"/users/delete/"+tuser.getId()%>">delete</a></td/>
	    
	  </tr>
	  <%}%>
	</table>
	<%} else {%>
	No users
	<%}%>	
</div>
<%@include file="footer.jsp" %>