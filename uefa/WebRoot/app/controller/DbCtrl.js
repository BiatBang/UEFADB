/**
 * controller of db part
 */

var dbCtrl = angular.module("uefa.controller.dbCtrl", []);

dbCtrl.controller("dbController", [
	'$scope',
	'$stateParams',
	'$location',
	'$http',
	'uefaService', 
	function($scope, $stateParams, $location, $http, uefaService){
		$scope.clubs = [];
		$scope.msg = "";
		
		$scope.queryClubs = function(){
			uefaService.queryClubs().then(function(response){
				if(response.success == true){
					$scope.msg = response.msg;
					
				}
			}, function(code){
				throw (code);
			});
			alert($scope.msg);
		}
		
		var init = function(){
			$scope.queryClubs();
			//alert("db hello");
		};
		
		init();
	}]);