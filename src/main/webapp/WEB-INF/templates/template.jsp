<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />	
	<title>mikasa.net 3.0 beta</title>

	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css" />
	<link rel="stylesheet" type="text/css" href="resources/css/application.css"/>
</head>

<body>
	<tiles:insertAttribute name="header" />
	<div class="container">
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>