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
		$scope.leagueList = [];
		$scope.league = "All";
		
		$scope.queryClubs = function(){
			uefaService.queryClubs().then(function(response){
				if(response.data.success == true){
				}
			}, function(code){
				throw (code);
			});
		}
		
		$scope.queryClubsByLeague = function(league){
			uefaService.queryClubsByLeague(league).then(function(response){
				if(response.data.success == true){
					console.log("caonima " + response.data.clubs);
				}
			}, function(code){
				throw (code);
			});
		}
		
		var init = function(){
			$scope.queryClubs($scope.league);			
			$scope.leagueList = [
				{name: 'All'},
				{name: 'La Liga'},
				{name: 'Premier League'}
			];
			
			//alert("db hello");
		};
		
		init();
		
		// some listeners
		var leagueSelector = document.getElementById("leagueSelector");
		leagueSelector.addEventListener("change", function() {
			$scope.league = leagueSelector.value.substring(7);
			$scope.queryClubsByLeague($scope.league);
		});
	}]);