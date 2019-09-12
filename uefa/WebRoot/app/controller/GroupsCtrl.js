/**
 * controller of groups part
 */

var groupsCtrl = angular.module("uefa.controller.groupsCtrl", []);

groupsCtrl.controller("groupsController", [
	'$scope',
	'$stateParams',
	'$location',
	'$http', function($scope, $stateParams, $location, $http){
		var init = function(){
			//alert("groups hello");
		};
		
		init();
	}]);