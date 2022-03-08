package com.cckoolu.github.dao;

import com.cckoolu.github.entity.JiFen2;

import java.util.List;

public interface JiFenDao {
    List<JiFen2> selectJiFen();

    int updateJiFen(JiFen2 jiFen2);

}
