<%@include file="header.jsp"%>
<form name="register" action="<%=request.getContextPath()%>/registerSubmit" method="post">

<div class="register bc">
		<ul>
		<li><span>User Name :</span><span><input name="userName" type="text" maxlength="35"></span></li>
		<li><span>Password :</span><span><input name="password" type="text" maxlength="35"></span></li>
		<li><span>Email :</span><span><input name="email" type="text" maxlength="35"></span></li>
		<li><span>First Name :</span><span><input name="firstName" type="text" maxlength="35"></span></li>
		<li><span>Last Name :</span><span><input name="lastName" type="text" maxlength="35"></span></li>
		<li><span>Gender :</span><span><select name="gender"`>
							<option value="">select</option>
							<option value="M">Male</option>
							<option value="F">Female</option>
						</select></span></li>
		<li><span>City :</span></li> <li><span><select name="city" multiple="multiple">
								<optgroup label="citiLables">
									<option value="Nagpur">Nagpur</option>
									<option value="Pune">Pune</option>
									<option value="Mumbai">Mumbai</option>
								</optgroup>
								</select></span>
							</li>
	<li><span>Frequently Travel's :</span>
				<span>
					<input name="traveler" type="radio" value="Y" id="traveler" /> Yes
					<input name="traveler" type="radio" value="N" id="traveler" /> No
				</span>
				
	</li>
	<li>
			<span>Language Known:</span>
			<span>
				<input name="language" type="checkbox" value="en"> English<br/>
				<input name="language" type="checkbox" value="hn"> Hindi<br/>
				<input name="language" type="checkbox" value="mr"> Marathi<br/> 
			</span>
	</li>
	
	<li><span></span><span><input type="submit" value="Submit" /></span></li>
	</ul></div>
</div>	
</form>
<%@include file="footer.jsp" %>