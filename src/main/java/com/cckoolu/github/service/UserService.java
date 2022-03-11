package com.cckoolu.github.service;

import com.cckoolu.github.entity.JiFen2;
import com.cckoolu.github.entity.JifenOnlyWxid;
import com.cckoolu.github.entity.Values3;
import com.cckoolu.github.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;



    public List<JifenOnlyWxid> selectJiFen() {
        List<JifenOnlyWxid> list =  userMapper.selectJiFen();
        return list;
    }

    public int updateJiFen(JiFen2 jiFen2 ){
        userMapper.updateJiFen(jiFen2);
        return 1;
    }

    public List<Values3> selectValues() {
        List<Values3> list = userMapper.selectValues();
        return list;
    }

    public int updateValue(Values3 values3) {
        userMapper.updateValue(values3);
        return 1;
    }
}