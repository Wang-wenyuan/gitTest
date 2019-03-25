package top.sifeizai.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.sifeizai.dao.ArticleClassifyMapper;
import top.sifeizai.dao.ArticleMapper;
import top.sifeizai.entity.PageResult;
import top.sifeizai.pojo.Article;
import top.sifeizai.pojo.ArticleClassify;
import top.sifeizai.service.ArticleService;

import java.util.ArrayList;
import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private ArticleClassifyMapper articleClassifyMapper;
    @Override
    public List<Article> findAll() {
        return articleMapper.findAll();
    }

    @Override
    public Article findById(Integer id) {
        return articleMapper.findById(id);
    }

    @Override
    public PageResult findByPage(int pageNum, int pageSize) {
        if(pageNum<=0){
            pageNum = 1;
        }
        if(pageSize<=0){
            pageSize = 5;
        }
        PageHelper.startPage(pageNum, pageSize);
        Page<Article> page = (Page<Article>)articleMapper.findPageBystate();
        return new PageResult(page.getTotal(),page.getResult(),page.getPages());
    }

    @Override
    public List<Article> findByRecommend() {
        return articleMapper.findByRecommend();
    }

    @Override
    public PageResult findByCount(Integer count,int pageNum,int pageSize) {
        if(pageNum<=0){
            pageNum = 1;
        }
        if(pageSize<=0){
            pageSize = 5;
        }
        PageHelper.startPage(pageNum,pageSize);
        Page<Article> page = (Page<Article>) articleMapper.findByCount(count);
        return new PageResult(page.getTotal(),page.getResult(),page.getPages());
    }

    @Override
    public List<Article> findRandomById() {
        return articleMapper.findRandomById();
    }

    @Override
    public PageResult findClassifyByNavigationId(int navigationId,int pageNum,int pageSize) {
        if(pageNum<=0){
            pageNum = 1;
        }
        if(pageSize<=0){
            pageSize = 5;
        }
        PageHelper.startPage(pageNum,pageSize);
        Page<ArticleClassify> page = (Page<ArticleClassify>)articleClassifyMapper.findByNavigationId(navigationId);
        return new PageResult(page.getTotal(),page.getResult(),page.getPages());
    }
}
