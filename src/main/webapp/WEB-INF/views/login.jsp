<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
		<title>mikasa.net - Login page</title>
		<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css" />
	</head>
	<body> 
		<div class="container-fluid">
			<div class="row-fluid"><div class="span12"/></div>
			<div class="row-fluid"><div class="span12"/></div>
			<div class="row-fluid"><div class="span12"/></div>
			<div class="row-fluid"><div class="span12"/></div>
			<div class="row-fluid"><div class="span12"/></div>
			<div class="row-fluid"><div class="span12"/></div>
			<div class="row-fluid"><div class="span12"/></div>
			<div class="row-fluid"><div class="span12"/></div>			
			<div class="row-fluid">
				<div class="span3"/>
				<div class="span6">
					<div class="well">
						<form action="j_spring_security_check" method="POST" class="form-horizontal">
							<legend>mikasa.net Login Page</legend>
							<div class="control-group">
								<label class="control-label" for="j_username">User</label>
								<div class="controls">
									<input type="text" id="j_username" name="j_username" placeholder="User Name"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="j_password">Password</label>
								<div class="controls">
									<input type="password" id="j_password" name="j_password" placeholder="Password"/>
								</div>
							</div>
							<div class="control-group">
								<div class="controls">
									<input type="submit" class="btn" value="Login"/>
								</div>
							</div>
						</form>
					</div>
				</div>
				<div class="span3"/>
			</div>
		</div>
	</body>
</html>

