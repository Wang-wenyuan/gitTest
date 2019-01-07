app.controller('viewPageController',function ($scope,viewPageService) {
    $scope.findAll=function () {
        viewPageService.findAll().success(function (response) {
            $scope.list=response;
        });
    }
});