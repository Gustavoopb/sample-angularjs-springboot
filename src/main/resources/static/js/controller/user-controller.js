angular.module('sampleapp').controller('UserController',
		function($scope, userService, $routeParams, $window) {
			$scope.initList = function() {
				userService.query(function(users) {
					$scope.users = users;
				}, function(error) {
					console.log(error);
				});
			};

			$scope.initForm = function() {
				if ($routeParams.id) {
					userService.get({
						id : $routeParams.id
					}, function(user) {
						$scope.defaultUser = user;
					}, function(error) {
						console.log(error);
					});
				}else{
					$scope.defaultUser = {};
				}
			}
			
			$scope.submit = function(){
				userService.save({
					id: $scope.defaultUser.id,
					firstName: $scope.defaultUser.firstName,
					email: $scope.defaultUser.email
				}, function(){
					$window.location.href = "/#/user";
				}, function(error){
					console.log(error);
				})	
			}
			
			$scope.remove = function(user){
				userService.remove({
					id: user.id
				}, function(){
					var userIndex = $scope.users.indexOf(user);
					$scope.users.splice(userIndex, 1);
				}, function(error){
					console.log(error);
				});
			}
		});