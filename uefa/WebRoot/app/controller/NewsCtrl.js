/**
 * Controller of news component
 */

var newsCtrl = angular.module("uefa.controller.newsCtrl", []);

newsCtrl.controller("newsController", [
	'$scope',
	'$stateParams',
	'$http',
	'$location', function($scope, $stateParams, $http, $location){
		var init = function(){
			//alert("news hello!");
		};
		
		init();
	}]);