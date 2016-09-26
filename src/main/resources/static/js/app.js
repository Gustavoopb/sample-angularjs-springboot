angular.module('sampleapp', ['ngRoute', 'ngResource']).config(function($routeProvider, $locationProvider) {
	$routeProvider.when('/', {
		templateUrl: 'layout/home.html'
	});
	
	$routeProvider.when('/user/', {
		templateUrl: 'layout/user-list.html',
		controller: 'UserController'
	});
	
	$routeProvider.when('/user/new', {
		templateUrl: 'layout/user-form.html',
		controller: 'UserController'
	});

	$routeProvider.when('/user/edit/:id', {
		templateUrl: 'layout/user-form.html',
		controller: 'UserController'
	});
	
	$routeProvider.otherwise({
		redirectTo: '/'
	});
});
