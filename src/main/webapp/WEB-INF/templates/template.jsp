<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">	
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="resources/css/application.css" />

	<title>mikasa.net 3.0 beta</title>

	<!-- Bootstrap core CSS -->
	<link href="resources/css/bootstrap.min.css" rel="stylesheet">
	<!-- Bootstrap theme -->
	<link href="resources/css/bootstrap-theme.min.css" rel="stylesheet">	
</head>

<body>
	<tiles:insertAttribute name="header" />

	<div class="container">
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
	</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>	

</body>
</html>