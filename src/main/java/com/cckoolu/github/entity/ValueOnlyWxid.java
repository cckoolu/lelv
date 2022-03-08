package com.cckoolu.github.entity;

public class ValueOnlyWxid {

    private String wxid;

    public String getWxid() {
        return wxid;
    }

    public ValueOnlyWxid(String wxid) {
        this.wxid = wxid;
    }

    @Override
    public String toString() {
        return wxid;
    }
}
