package com.cckoolu.github.entity;




import java.util.Date;

public class Values3 {
    private  String phone;
    private  String name;
    private  String chiid;
    private  String chiid2;
    private  int pid;
    private  String value;
    private  String sessionid;
    private  String jiuquan;
    private  String wxid;
    private  String token;
    private  String xingming;
    private  Date updated;

    public Values3(){

    }
    public Values3(String phone, String name, String chiid, String chiid2, int pid, String value,
                   String sessionid, String jiuquan, String wxid, String token, String xingming, Date date) {
        this.phone = phone;
        this.name = name;
        this.chiid = chiid;
        this.chiid2 = chiid2;
        this.pid = pid;
        this.value = value;
        this.sessionid = sessionid;
        this.jiuquan = jiuquan;
        this.wxid = wxid;
        this.token = token;
        this.xingming = xingming;
        this.updated = date;
    }

    @Override
    public String toString() {
        return "Values3{" +
                "phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", chiid='" + chiid + '\'' +
                ", chiid2='" + chiid2 + '\'' +
                ", pid=" + pid +
                ", value='" + value + '\'' +
                ", sessionid='" + sessionid + '\'' +
                ", jiuquan='" + jiuquan + '\'' +
                ", wxid='" + wxid + '\'' +
                ", token='" + token + '\'' +
                ", xingming='" + xingming + '\'' +
                ", updated=" + updated +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getJiuquan() {
        return jiuquan;
    }

    public void setJiuquan(String jiuquan) {
        this.jiuquan = jiuquan;
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
