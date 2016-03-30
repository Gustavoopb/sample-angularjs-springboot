(function(){
	var app = angular.module('store', []);

	app.controller('StoreController', ['$http', function($http){
		var store = this;
		this.products = [];
		$http.get('http://localhost:8080/findAll').success(function(data){
			store.products = data;
		});
	}]);
})();