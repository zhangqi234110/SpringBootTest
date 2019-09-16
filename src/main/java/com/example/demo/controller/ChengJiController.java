package com.example.demo.controller;

import com.example.demo.Common;
import com.example.demo.pojo.ChengJi;
import com.example.demo.service.ChengJiService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 张齐 on 2019/9/13.
 */
@RestController
public class ChengJiController {
    @Autowired(required = true)
    private ChengJiService chengJiService;

    //查询所有
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @ResponseBody
    public Common findAll(){
        List<ChengJi> all = chengJiService.findAll();
        return new Common(200,"查询所有",all);
    }

    //查询一个
    @RequestMapping(value = "/findOne",method = RequestMethod.POST)
    @ResponseBody
    public Common findOne(int id){
        ChengJi one = chengJiService.findOne(id);
        return new Common(200,"查询一个",one);
    }

    //添加一个
    @RequestMapping(value = "/addOne",method = RequestMethod.POST)
    @ResponseBody
    public Common findOne(HttpServletRequest request){
        String parameter1 = request.getParameter("name");
        String parameter2 = request.getParameter("kemu");
        String id1 = request.getParameter("id");
        String fenshu1 = request.getParameter("fenshu");
        int id=Integer.parseInt(id1);
        int fenshu=Integer.parseInt(fenshu1);
        //int fenshu = (int) request.getAttribute("fenshu");
        ChengJi chengJi = new ChengJi();
        chengJi.setName(parameter1);
        chengJi.setKemu(parameter2);
        chengJi.setId(id);
        chengJi.setFenshu(fenshu);
        System.out.println(chengJi.getName());
        //chengJi.setFenshu(fenshu);
        int i = chengJiService.addOne(chengJi);
        Map map = new HashMap();
        map.put("name",parameter1);
        map.put("kemu",parameter2);
        map.put("id",id);
        map.put("fenshu",fenshu);
        //map.put("fenshu",fenshu);
        return new Common(200,"成功添加一个，返回查看添加的数据",map);
    }

    //x修改一个
    @RequestMapping(value = "/updateOne",method = RequestMethod.POST)
    @ResponseBody
    public Common updateOne(ChengJi chengJi){
        int i = chengJiService.updateOne(chengJi);
        return new Common(200,"修改一个",i);
    }

    //删除一个
    @RequestMapping(value = "/deleteOne",method = RequestMethod.POST)
    @ResponseBody
    public Common deleteOne(int id){
        int i = chengJiService.deleteOne(id);
        return new Common(200,"删除一个",i);
    }

    //批量删除
    @RequestMapping(value = "/deleteMany",method = RequestMethod.POST)
    @ResponseBody
    public Common deleteMany(List<Integer> id){
        int i = chengJiService.deleteMany(id);
        return new Common(200,"批量删除",0);
    }

}
