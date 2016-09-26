var module = angular.module('sampleapp');
module.factory('userService', function($resource) {
	// http://localhost:8080/server/user?id=1
	return $resource('/server/user/', {
		id : '@id',
		firstName : '@firstName',
		email : '@email'
	}, {
		stripTrailingSlashes : false
	});
});