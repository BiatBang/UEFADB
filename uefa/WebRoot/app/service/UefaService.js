/**
 * define some functions from every controller
 */

var uefa = angular.module('uefa.service.uefa', []);

uefa.constant('uefaServiceConfig', {
	urls: {
		queryClubs: "/uefa/ctrl/uefa/queryClubs.do"
	}
}).factory(// lots of functions, provide result data to controllers
		'uefaService', ['$http', '$q', 'uefaServiceConfig', function($http, $q, uefaServiceConfig){
		return{
			queryClubs: function (){
				var deffered = $q.defer();//内置服务 同步请求数据
				$http({
					// json object
					method: 'GET',
					dataType: "json",
					contentType: 'application/json; charset=UTF-8',
					url: uefaServiceConfig.urls.queryClubs,
				}).then(function successCallback(response){
					var msg = response.msg;
					console.log(response.data.msg);
					deffered.resolve(response);
				}, function errorCallback(response){
					deffered.reject(response);
				});
				return deffered.promise;
			}
		};
	}]);