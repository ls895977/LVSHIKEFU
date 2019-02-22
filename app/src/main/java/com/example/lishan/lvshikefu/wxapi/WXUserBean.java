package com.example.lishan.lvshikefu.wxapi;

import java.util.List;

public class WXUserBean {
    /**
     * openid : oGNI207voc3x0Rg7PnypRtD7dD0U
     * nickname : 一个人的青春战役
     * sex : 1
     * language : zh_CN
     * city : Yibin
     * province : Sichuan
     * country : CN
     * headimgurl : http://thirdwx.qlogo.cn/mmopen/vi_32/N3TeVsZgr8BH3LgM8HPwAPQC6ds1gDeqAyyBncgPIxMJ86y5nsXlyGxDiaREkRia07hkayRSLeib2uyYTYsqoQZnA/132
     * privilege : []
     * unionid : oFn820zcDf5SnkEPWn3c2_cuW4qI
     */
    private String openid;
    private String nickname;
    private int sex;
    private String language;
    private String city;
    private String province;
    private String country;
    private String headimgurl;
    private String unionid;
    private List<?> privilege;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public List<?> getPrivilege() {
        return privilege;
    }

    public void setPrivilege(List<?> privilege) {
        this.privilege = privilege;
    }
}