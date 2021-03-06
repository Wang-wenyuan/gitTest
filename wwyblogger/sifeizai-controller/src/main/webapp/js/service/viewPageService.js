app.service('viewPageService',function ($http) {
    //轮播图
    this.findAll=function () {
        return $http.get('viewPage/findAll.do');
    }
    //导航
    this.findNavigationAll=function () {
        return $http.get('navigation/findGroup.do');
    }
    //最新发布
    this.findPage=function (pageNum,pageSize) {
        return $http.get('article/findByPage.do?pageNum='+pageNum+'&pageSize='+pageSize);
    }
    //特别推荐
    this.findByRecommend=function () {
        return $http.get('article/findByRecommend.do');
    }
    //推荐文章
    this.findByCount=function (pageNum,pageSize) {
        return $http.get('article/findByCount.do?pageNum='+pageNum+'&pageSize='+pageSize);
    }
    //根据id查找
    this.findById=function (id) {
        return $http.get('article/findById.do?id='+id);
    }
    //随机查询
    this.findRandomById=function () {
        return $http.get('article/findRandomById.do');
    }
    //导航分类分页查询
    this.findClassifyByNavigationId = function (navigationId, pageNum, pageSize) {
        return $http.get('article/findClassifyByNavigationId.do?navigationId=' + navigationId + '&pageNum=' + pageNum + '&pageSize=' + pageSize);
    }
});