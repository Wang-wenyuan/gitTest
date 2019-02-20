app.controller('viewPageController',function ($scope,viewPageService) {
    //查找导航
    $scope.findNavigationAll=function () {
        viewPageService.findNavigationAll().success(function (response) {
            $scope.navigationList=response;
        });
    }
    //查找轮播
    $scope.findAll=function () {
        viewPageService.findAll().success(function (response) {
            $scope.list=response;
        });
    }
    //分页查找
    $scope.findPage=function () {
        viewPageService.findPage($scope.pageMap.pageNum,$scope.pageMap.pageSize).success(function (response) {
            $scope.pageResult=response;
            buildPageLabel();
        });
    }
    //加载页面时加载
    $scope.initPage=function () {
        $scope.findPage();
    }
    //进行分页
    $scope.pageMap={'pageNum':1,'pageSize':5};
    $scope.currentPage=function (pageNum, pageSize) {
        $scope.pageMap.pageNum = pageNum;
        $scope.pageMap.pageSize = pageSize;
        //调用分页标签
        $scope.findPage();
    }

    //分页标签
    buildPageLabel=function () {

        $scope.pageLabel=[];
        var totalPage = $scope.pageResult.pages;
        var beginPage = 1;
        var endPage = totalPage;
        //最多显示5页,前2,后2,
        // 如果不够5页,全部显示
        //当点击后最后两页时,只算前面的每次减1
        if(totalPage>5){
            //继续判断是否大于第三页,大于三的话就前2后2
            if($scope.pageMap.pageNum>=3){
                beginPage = $scope.pageMap.pageNum-2;
                endPage = $scope.pageMap.pageNum+2;
                //倒数第三页的时候
                if($scope.pageMap.pageNum>=totalPage-2){
                    beginPage = totalPage-4;
                    endPage = totalPage;
                }
            }else{
                //这里面是小于3的,
                beginPage = 1;
                endPage = 5;

            }
        }

        //循环产生页码标签
        for(var i=beginPage;i<=endPage;i++){
            $scope.pageLabel.push(i);
        }
    }

    //特别推荐
    $scope.findByRecommend=function () {
        viewPageService.findByRecommend().success(function (response) {
            $scope.recommendList=response;
        });
    }

    //推荐文章
    $scope.findByCount=function () {
        viewPageService.findByCount($scope.countPageMap.pageNum,$scope.countPageMap.pageSize).success(function (response) {
            $scope.countPageResult=response;
        });
    }

    //进行分页
    $scope.countPageMap={'pageNum':1,'pageSize':5};
    $scope.countCurrentPage=function (pageNum, pageSize) {
        $scope.countPageMap.pageNum = pageNum;
        $scope.countPageMap.pageSize = pageSize;
        //调用分页
        $scope.findByCount();
    }
    //定义刷新
    $scope.refresh=function () {
        $scope.countPageMap.pageNum = $scope.countPageMap.pageNum + 1;
        if($scope.countPageMap.pageNum>$scope.countPageResult.pages){
            $scope.countPageMap.pageNum = 1;
        }
        $scope.findByCount();
    }

});