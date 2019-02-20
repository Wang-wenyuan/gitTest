package top.sifeizai.dao;

import top.sifeizai.pojo.Article;

import java.util.List;

public interface ArticleMapper {
    /**
     * 查询全部
     * @return
     */
    List<Article> findAll();

    /**
     * 根据id查找
     * @return
     */
    Article findById(Integer id);

    /**
     * 总记录数
     * @return
     */
    Integer count();

    /**
     * 分页查找
     * @return
     */
    List<Article> findPageBystate();

    /**
     * 查询特别推荐,只能有6个
     * @return
     */
    List<Article> findByRecommend();
    /**
     * 根据访问量查询
     *
     */
    List<Article> findByCount(Integer count);
}
