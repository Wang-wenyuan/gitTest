package top.sifeizai.service;

import top.sifeizai.pojo.Navigation;

import java.util.List;

public interface NavigationService {
    /**
     * 查询全部
     * @return
     */
    List<Navigation> findAll();

    List<Navigation> findByParentId(Integer id);
}
