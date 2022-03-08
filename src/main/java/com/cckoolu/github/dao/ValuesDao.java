package com.cckoolu.github.dao;


import com.cckoolu.github.entity.Values3;

import java.util.List;

public interface ValuesDao {
    List<Values3> selectValues();

    int updateValue(Values3 values3);
}
