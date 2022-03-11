package com.cckoolu.github.mapper;

import com.cckoolu.github.entity.JiFen2;
import com.cckoolu.github.entity.JifenOnlyWxid;
import com.cckoolu.github.entity.Values3;

import java.util.List;

public interface UserMapper {
    List<JifenOnlyWxid> selectJiFen();

    void updateJiFen(JiFen2 jiFen2);

    List<Values3> selectValues();

    void updateValue(Values3 values3);
}