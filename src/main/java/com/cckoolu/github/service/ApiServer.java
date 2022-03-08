package com.cckoolu.github.service;

import com.cckoolu.github.dao.JiFenDao;
import com.cckoolu.github.dao.ValuesDao;
import com.cckoolu.github.entity.JiFen2;
import com.cckoolu.github.entity.Values3;
import com.cckoolu.github.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
public class ApiServer {
    @PostMapping(value = "/api/Values/setToken3")
    public int receiveValues(@RequestParam Map<String, String> params,
                             @RequestParam(name = "id") int id,
                             @RequestParam(name = "update") int update) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
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

        ValuesDao valuesDao = sqlSession.getMapper(ValuesDao.class);
        Date date = new Date();// 获取当前时间
        Values3 values3 = new Values3(phone, name, chiid, chiid2, id, value,
                sessionid, jiuquan, wxid, token, xingming, update, date);

        int num = valuesDao.updateValue(values3);
        System.out.println("SQL执行结果：   " + num);
        sqlSession.commit();
        sqlSession.close();
        return 1;
    }


    @PostMapping(value = "/api/JiFen/setToken2")
    public int receiveIntegral(@RequestParam Map<String, String> params,
                               @RequestParam(name = "update") int update) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        String wxid = params.get("wxid");
        String nicheng = params.get("nicheng");
        String chiid = params.get("chiid");
        String chiid2 = params.get("chiid2");
        String code = params.get("code");

        System.out.println("wxid:  " + wxid);
        System.out.println("update:  " + update);

        JiFenDao jiFenDao = sqlSession.getMapper(JiFenDao.class);
        Date date = new Date();// 获取当前时间
        JiFen2 jiFen2 = new JiFen2(nicheng, wxid, chiid, chiid2, code, update, date);
        int num = jiFenDao.updateJiFen(jiFen2);
        System.out.println("SQL执行结果：   " + num);
        sqlSession.commit();
        sqlSession.close();
        return 1;
    }


    @GetMapping(value = "/api/Values/GetLeDouNotNeedCode")
    public List<Values3> returnIntegral() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ValuesDao valuesDao = sqlSession.getMapper(ValuesDao.class);
        List<Values3> valuesDaoList = valuesDao.selectValues();
        System.out.println("valuesDaoList  "+valuesDaoList);

        return valuesDaoList;
    }


    @GetMapping(value = "/api/JiFen/GetNotNeedUpdate")
    public List<JiFen2> returnValues() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        JiFenDao jiFenDao = sqlSession.getMapper(JiFenDao.class);
        List<JiFen2> jiFenDaoList = jiFenDao.selectJiFen();
        System.out.println("jiFenDaoList "+jiFenDaoList);

        return jiFenDaoList;
    }
}

