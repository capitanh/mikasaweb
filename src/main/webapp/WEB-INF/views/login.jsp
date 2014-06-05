<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="eng">
	<head>
		<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
		
		<title>mikasa.net - Login page</title>

		<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css" />
	</head>
	
	<body> 
		<nav class="navbar navbar-inverse navbar-static-top" role="navigation">
			<div class="container">
				<p class="navbar-text">mikasa.net 3.0 beta</p>
			</div>
		</nav>

	<div class="container-fluid">
			


		<div class="row">
			<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<div class="well">
					<form role="form" action="j_spring_security_check" method="POST">
						<legend>Login Form</legend>
						<div class="form-group">
							<label for="j_username">User</label>
							<input type="text" id="j_username" name="j_username" class="form-control" placeholder="User Name"/>
						</div>
						<div class="form-group">
							<label for="j_password">Password</label>
							<input type="password" id="j_password" name="j_password" class="form-control" placeholder="Password"/>
						</div>
						<button type="submit" class="btn btn-primary">Login</button>
					</form>
				</div>
			</div>
			<div class="col-md-3"></div>
		</div>
		

		</div>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>		
	</body>
</html>

