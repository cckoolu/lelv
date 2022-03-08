package com.cckoolu.github.entity;

public class JifenOnlyWxid {
        private String wxid;

        public String getWxid() {
            return wxid;
        }

    public JifenOnlyWxid(String wxid) {
        this.wxid = wxid;
    }

    @Override
    public String toString() {
        return wxid;
    }
}

