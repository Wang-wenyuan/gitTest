package top.sifeizai.dao;

import top.sifeizai.pojo.ArticleClassify;

import java.util.List;

public interface ArticleClassifyMapper {
    /**
     * 根据导航id查询
     * @param navigationId
     * @return
     */
    List<ArticleClassify> findByNavigationId(int navigationId);
}
