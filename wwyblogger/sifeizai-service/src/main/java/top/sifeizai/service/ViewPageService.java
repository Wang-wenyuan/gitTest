package top.sifeizai.service;

import top.sifeizai.pojo.Viewpager;

import java.util.List;

public interface ViewPageService {
    /**
     * 查找全部轮播图
     * @return
     */
    List<Viewpager> findAll();
}
