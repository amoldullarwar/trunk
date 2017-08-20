<%@include file="header.jsp"%>

<form name="login" action="<%=request.getContextPath()%>/loginSubmit" method="post">
<div class="register bc">
		<ul>
			<li><span>User Name :</span><span><input name="userName" type="text" maxlength="35"></span></li>
			<li><span>Password :</span><span><input name="password" type="text" maxlength="35"></span></li>
			<li><span></span><span><input type="submit" value="Submit" /></span></li>
		</ul>
</div>	
</form>
<%@include file="footer.jsp" %>