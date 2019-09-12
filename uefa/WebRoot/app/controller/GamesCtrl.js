/**
 * controller of games part
 */

var gamesCtrl = angular.module("uefa.controller.gamesCtrl", []);

gamesCtrl.controller("gamesController", [
	'$scope',
	'$stateParams',
	'$location',
	'$http', function($scope, $stateParams, $location, $http){
		var init = function(){
			//alert("games hello");
		};
		
		init();
	}]);