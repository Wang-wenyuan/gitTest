package top.sifeizai.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.sifeizai.dao.ViewPagerMapper;
import top.sifeizai.pojo.Viewpager;
import top.sifeizai.service.ViewPageService;

import java.util.List;
@Service
public class ViewPageServiceImpl implements ViewPageService {
    @Autowired
    private ViewPagerMapper viewPagerMapper;

    @Override
    public List<Viewpager> findAll() {
        List<Viewpager> list = viewPagerMapper.findAll();
        return list;
    }
}
