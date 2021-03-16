angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:5555/democloud';

    $scope.fillProducts = function () {
        $http.get(contextPath + '/fclient/demoservice/v1/products')
            .then(function (response) {
            $scope.productList = response.data;
        })
    }

    $scope.fillProducts();
});