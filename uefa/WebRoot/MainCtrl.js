/**
 * 
 */

var mainCtrl = angular.module('uefa.mainCtrl', []);

mainCtrl.controller("mainController", [
	'$scope',
	'$stateParams',
	'$location',
	'$http',
	function($scope, $stateParams, $location, $http){
		var init = function(){
//			alert("main hello");
		};
		
		init();
	}]);