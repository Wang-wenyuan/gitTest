app.controller('viewPageController',function ($scope, $location,$sce,viewPageService) {
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
    //加载页面时加载
    $scope.initPage=function () {
        $scope.findPage();
    }
    //进行分页
    $scope.pageMap={'pageNum':1,'pageSize':5};
    $scope.currentPage=function (pageNum, pageSize) {
        if($scope.pageResult.pages){
            if(pageNum<=1){
                pageNum=1;
            }
            if(pageNum>=$scope.pageResult.pages){
                pageNum=$scope.pageResult.pages;
            }
        }
        $scope.pageMap.pageNum = pageNum;
        $scope.pageMap.pageSize = pageSize;
        //调用分页标签
        $scope.findPage();
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
    //实现原理,获取总页数和当前页,进行比较,每次都把当前页加一,直到最后一页时,从第一页开始
    $scope.refresh=function () {
        $scope.countPageMap.pageNum = $scope.countPageMap.pageNum + 1;
        if($scope.countPageMap.pageNum>$scope.countPageResult.pages){
            $scope.countPageMap.pageNum = 1;
        }
        $scope.findByCount();
    }
    //获取url参数
    $scope.urlParameter=function () {
        $scope.parameterId=$location.search().id;
        $scope.parameterNavigationId=$location.search().navigationId;
        $scope.parameterNavigationTitle=$location.search().titleName;
    }
    //根据id查找
    $scope.findById=function () {
        $scope.urlParameter();
        viewPageService.findById($scope.parameterId).success(function (response) {
            $scope.particularsList=response;
            //html字符串
            $scope.detailDesc = $sce.trustAsHtml($scope.particularsList.contents);
            document.title=$scope.particularsList.title;
        });
    }
    //随机查询
    $scope.findRandomById=function () {
        viewPageService.findRandomById().success(function (response) {
            $scope.randomList=response;
        });
    }

    //导航分类分页查询
    $scope.findClassifyByNavigationId=function () {
        //alert($scope.classifyPageMap.pageNum);
        viewPageService.findClassifyByNavigationId($scope.parameterNavigationId,$scope.classifyPageMap.pageNum,$scope.classifyPageMap.pageSize).success(function (response) {
            $scope.classifyPageResult=response;
            buildClassifyPageLabel();
        });
    }
    //进行分页
    $scope.classifyPageMap={'pageNum':1,'pageSize':5};
    $scope.classifyPageResult={};
    $scope.classifyCurrentPage=function (pageNum, pageSize) {
        if($scope.classifyPageResult.pages){
            if(pageNum<=1){
                pageNum=1;
            }
            if(pageNum>=$scope.classifyPageResult.pages){
                pageNum=$scope.classifyPageResult.pages;
            }
        }
        $scope.classifyPageMap.pageNum = pageNum;
        $scope.classifyPageMap.pageSize = pageSize;
        //调用分页
        $scope.findClassifyByNavigationId();
    }
    //分页标签
    buildClassifyPageLabel=function () {

        $scope.classifyPageLabel=[];
        var totalPage = $scope.classifyPageResult.pages;
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
            $scope.classifyPageLabel.push(i);
        }
    }

    //修改title值
    $scope.updateTitle=function () {
        document.title="SFZ-"+$scope.parameterNavigationTitle;
    }
    $scope.reload = function () {
        location.reload();
    }

    //刷新页面
    $scope.reload = function () {
        window.location.reload();
    }

});