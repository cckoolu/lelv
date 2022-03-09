package com.cckoolu.github.entity;

import java.util.Date;

public class JiFen2 {
    private int id;
    private String nicheng;
    private String wxid;
    private String chiid;
    private String chiid2;
    private String code;
    private int update;
    private Date updated;

    public JiFen2(String nicheng, String wxid, String chiid, String chiid2, String code, int update, Date date) {
        this.nicheng = nicheng;
        this.wxid = wxid;
        this.chiid = chiid;
        this.chiid2 = chiid2;
        this.code = code;
        this.update = update;
        this.updated = date;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNicheng() {
        return nicheng;
    }

    public void setNicheng(String nicheng) {
        this.nicheng = nicheng;
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid;
    }

    public String getChiid() {
        return chiid;
    }

    public void setChiid(String chiid) {
        this.chiid = chiid;
    }

    public String getChiid2() {
        return chiid2;
    }

    public void setChiid2(String chiid2) {
        this.chiid2 = chiid2;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getUpdate() {
        return update;
    }

    public void setUpdate(int update) {
        this.update = update;
    }

    @Override
    public String toString() {
        return "JiFen2{" +
                "id=" + id +
                ", nicheng='" + nicheng + '\'' +
                ", wxid='" + wxid + '\'' +
                ", chiid='" + chiid + '\'' +
                ", chiid2='" + chiid2 + '\'' +
                ", code='" + code + '\'' +
                ", update=" + update +
                '}';
    }
}
