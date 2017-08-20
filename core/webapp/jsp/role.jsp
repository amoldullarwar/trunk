<%@include file="header.jsp"%>

<form name="login" action="<%=request.getContextPath()%>/roleSubmit" method="post">
<div class="register bc">
		<ul>
			<li><span>Role Name :</span><span><input name="Name" type="text" maxlength="15"></span></li>
			<li><span>Description :</span><span>
											<textarea rows="2" cols="20" name="description"></textarea>
										  </span></li>
			<li><span></span><span><input type="submit" value="Submit" /></span></li>
		</ul>
</div>	
</form>
<%@include file="footer.jsp" %>

A

