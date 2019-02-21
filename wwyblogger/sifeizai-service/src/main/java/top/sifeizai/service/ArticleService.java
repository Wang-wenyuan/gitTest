package top.sifeizai.service;

import top.sifeizai.entity.PageResult;
import top.sifeizai.pojo.Article;

import java.util.List;

public interface ArticleService {
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
     * 分页查找
     * @return
     */
    PageResult findByPage(int pageNum,int pageSize);

    /**
     * 查找推荐
     * @return
     */
    List<Article> findByRecommend();

    /**
     * 根据访问人数查询
     * @param count
     * @return
     */
    PageResult findByCount(Integer count,int pageNum,int pageSize);

    /**
     * 随机根据id查询
     * @param
     * @return
     */
    List<Article> findRandomById();
}
