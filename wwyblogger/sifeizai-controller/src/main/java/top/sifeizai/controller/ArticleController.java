package top.sifeizai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.sifeizai.entity.PageResult;
import top.sifeizai.pojo.Article;
import top.sifeizai.service.ArticleService;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /**
     * 分页查找
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/findByPage")
    public PageResult findByPage(int pageNum,int pageSize){
        return articleService.findByPage(pageNum,pageSize);
    }

    /**
     * 查找特别推荐
     * @return
     */
    @RequestMapping("/findByRecommend")
    public List<Article> findByRecommend(){
        return articleService.findByRecommend();
    }

    /**
     * 查找推荐文章
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/findByCount")
    public PageResult findByCount(int pageNum,int pageSize){
        int count = 30;
        return articleService.findByCount(count,pageNum,pageSize);
    }

    /**
     * 根据id查找
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public Article findById(int id){
        return articleService.findById(id);
    }

    /**
     * 随机查找
     * @return
     */
    @RequestMapping("/findRandomById")
    public List<Article> findRandomById(){
       return articleService.findRandomById();
    }

}
