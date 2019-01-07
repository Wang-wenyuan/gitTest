app.service('viewPageService',function ($http) {
    this.findAll=function () {
        return $http.get('viewPage/findAll.do');
    }
});