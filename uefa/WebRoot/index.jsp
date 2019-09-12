<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
  	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <script src = 'js/jquery-1.9.1.min.js'></script>
	<script src = 'js/angular.min.js'></script>
	<script src = 'js/angular-ui-router.min.js'></script>
	<script src = 'application.js' type="text/javascript"></script>
	<script src = "router.js" type="text/javascript"></script>
	
	<script src = 'app/controller/MainNavCtrl.js' type="text/javascript"></script>
	<script src = 'app/controller/NewsCtrl.js' type="text/javascript"></script>
	<script src = 'app/controller/GroupsCtrl.js' type="text/javascript"></script>
	<script src = 'app/controller/GamesCtrl.js' type="text/javascript"></script>
	<script src = 'app/controller/DbCtrl.js' type="text/javascript"></script>
	
	<script src = 'service.js' type="text/javascript"></script>
	<script src = 'app/service/UefaService.js' type="text/javascript"></script>

	<link rel="stylesheet" href="css/ui.css" />
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

	<script src = 'MainCtrl.js' type="text/javascript"></script>
		
    <title>UEFA DB</title>

  </head>
  
  <body ng-app="uefa" ng-controller="mainController" ng-id="ng-app">
    <div class="main_wrapper">
    	<div class="header">
    		<div class="sub_logo">19-20 UEFA DB</div>
    	</div>   	
    	<div class="container">
    		<div ui-view="main" style="width: 100%"></div>
    	</div>
    </div>
    
    <div class="foot_wrapper">
    		<div class="footer">made by bielelele</div>
    </div>
  </body>
</html>
