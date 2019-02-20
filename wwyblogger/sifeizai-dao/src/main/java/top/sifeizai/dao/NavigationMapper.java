package top.sifeizai.dao;

import top.sifeizai.pojo.Navigation;

import java.util.List;

public interface NavigationMapper {
    /**
     * 查询全部
     * @return
     */
    List<Navigation> findAll();

    /**
     * 根据父id查找
     * @param id
     * @return
     */
    List<Navigation> findByParentId(Integer id);
}
