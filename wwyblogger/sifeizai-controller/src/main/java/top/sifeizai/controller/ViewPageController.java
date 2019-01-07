package top.sifeizai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.sifeizai.pojo.Viewpager;
import top.sifeizai.service.ViewPageService;

import java.util.List;

@RestController
@RequestMapping("/viewPage")
public class ViewPageController {
    @Autowired
    private ViewPageService viewPageService;
    /**
     * 查找全部
     * @return
     */
    @RequestMapping("/findAll")
    public List<Viewpager> findAll(){
        List<Viewpager> list = viewPageService.findAll();
        System.out.println("aaa");
        return list;
    }
}
