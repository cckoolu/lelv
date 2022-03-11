package com.cckoolu.github.controller;

import com.cckoolu.github.entity.JiFen2;
import com.cckoolu.github.entity.JifenOnlyWxid;
import com.cckoolu.github.entity.Values3;
import com.cckoolu.github.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class UserController {
    @Autowired
    private UserService userService;



    @PostMapping(value = "/api/Values/setToken3")
    public int receiveValues(@RequestParam Map<String, String> params,
                             @RequestParam(name = "id") int id) {
        String wxid = params.get("wxid");
        String phone = params.get("phone");
        String chiid = params.get("chiid");
        String chiid2 = params.get("chiid2");
        String name = params.get("name");
        String value = params.get("value");
        String sessionid = params.get("sessionid");
        String jiuquan = params.get("jiuquan");
        String token = params.get("token");
        String xingming = params.get("xingming");

        Date date = new Date();// 获取当前时间
        System.out.println(date);
        Values3 values3 = new Values3(phone, name, chiid, chiid2, id, value,
                sessionid, jiuquan, wxid, token, xingming,  date);

        int num = userService.updateValue(values3);
        System.out.println("SQL执行结果：   " + num);

        return 1;
    }

    @PostMapping(value = "/api/JiFen/setToken2")
    public int receiveIntegral(@RequestParam Map<String, String> params) {

        String wxid = params.get("wxid");
        String nicheng = params.get("nicheng");
        String chiid = params.get("chiid");
        String chiid2 = params.get("chiid2");
        String code = params.get("code");

        System.out.println("wxid:  " + wxid);

        Date date = new Date();// 获取当前时间
        JiFen2 jiFen2 = new JiFen2(nicheng, wxid, chiid, chiid2, code, date);
        int num = userService.updateJiFen(jiFen2);
        System.out.println("SQL执行结果：   " + num);

        return 1;
    }

    @GetMapping(value = "/api/Values/GetLeDouNotNeedCode")
    public List<Values3> returnIntegral() {
        List<Values3> valuesDaoList = userService.selectValues();
        System.out.println("valuesDaoList  "+valuesDaoList.toString());

        return valuesDaoList;
    }

    @GetMapping(value = "/api/JiFen/GetNotNeedUpdate")
    public List<JifenOnlyWxid> returnValues() {
        List<JifenOnlyWxid> jiFenDaoList = userService.selectJiFen();
        System.out.println("jiFenDaoList "+jiFenDaoList);

        return jiFenDaoList;
    }

}