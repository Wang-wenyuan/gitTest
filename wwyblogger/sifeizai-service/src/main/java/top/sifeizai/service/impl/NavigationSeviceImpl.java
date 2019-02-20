package top.sifeizai.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.sifeizai.dao.NavigationMapper;
import top.sifeizai.pojo.Navigation;
import top.sifeizai.service.NavigationService;

import java.util.List;
@Service
public class NavigationSeviceImpl implements NavigationService {
    @Autowired
    private NavigationMapper navigationMapper;

    /**
     * 查询全部
     * @return
     */
    @Override
    public List<Navigation> findAll() {
        List<Navigation> list = navigationMapper.findAll();
        return list;
    }

    /**
     * 根据父id查找
     * @return
     */
    @Override
    public List<Navigation> findByParentId(Integer id) {
        List<Navigation> parentList = navigationMapper.findByParentId(id);
        return parentList;
    }
}
