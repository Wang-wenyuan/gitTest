package top.sifeizai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.sifeizai.pojo.Navigation;
import top.sifeizai.service.NavigationService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/navigation")
public class NavigationController {
    @Autowired
    private NavigationService navigationService;

    /**
     * 查询全部
     * @return
     */
    @RequestMapping("findAll")
    public List<Navigation> findAll(){
        List<Navigation> list = navigationService.findAll();
        return list;
    }
    @RequestMapping("/findGroup")
    public List findGroup(){
        //查找父id为0的
        List<Navigation> oneList = navigationService.findByParentId(0);
        for (Navigation navigation : oneList) {
            //查找下一级
            List<Navigation> twoList = navigationService.findByParentId(navigation.getId());
            navigation.setList(twoList);
        }
        System.out.println("导航"+oneList);
        return oneList;
    }
}
