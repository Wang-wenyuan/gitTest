package top.sifeizai.pojo;

import java.util.List;

public class ArticleClassify {
    private Integer navigationId;
    private Integer articleId;
    private List<Article> articleList;

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }

    public Integer getNavigationId() {
        return navigationId;
    }

    public void setNavigationId(Integer navigationId) {
        this.navigationId = navigationId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    @Override
    public String toString() {
        return "ArticleClassify{" +
                "navigationId=" + navigationId +
                ", articleId=" + articleId +
                ", articleList=" + articleList +
                '}';
    }
}
