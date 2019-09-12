/**
 * 
 */

var router = angular.module("uefa.router",["ui.router",
	"uefa.controller.mainNavCtrl",
	"uefa.controller.newsCtrl",
	"uefa.controller.groupsCtrl",
	"uefa.controller.gamesCtrl",
	"uefa.controller.dbCtrl"
	]);

router.run(['$rootScope', '$state', '$stateParams', 
            function($rootScope, $state, $stateParams){
				$rootScope.$state = $state;
				$rootScope.$stateParams = $stateParams;
	}]).config(function($stateProvider, $urlRouterProvider, $locationProvider){
		$locationProvider.hashPrefix('');
		$urlRouterProvider.otherwise("/mainNav");
		$stateProvider.state(
			{
				name: 'mainNav',
				url: '/mainNav',
				views: {
					'main': {
						templateUrl: '/uefa/app/view/mainNav.html',
						controller: 'mainNavController'
					}
				}
			}
		).state({
			name: 'mainNav.news',
			url: '/news',
			views: {
				'applyContent': {
					templateUrl: '/uefa/app/view/news.html',
					controller: 'newsController'
				}
			}
		}).state({
			name: 'mainNav.groups',
			url: '/groups',
			views: {
				'applyContent': {
					templateUrl: '/uefa/app/view/groups.html',
					controller: 'groupsController'
				}
			}
		}).state('mainNav.games',{
			url: '/games',
			views: {
				'applyContent': {
					templateUrl: '/uefa/app/view/games.html',
					controller: 'gamesController'
				}
			}
		}).state('mainNav.db',{
			url: '/db',
			views: {
				'applyContent': {
					templateUrl: '/uefa/app/view/db.html',
					controller: 'dbController'
				}
			}
		});
	});