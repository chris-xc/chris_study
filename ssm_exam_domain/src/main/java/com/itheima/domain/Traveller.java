package com.itheima.domain;

/**
 * @Author 王磊
 * @Date 2019/8/15/015
 */
public class Traveller {

    private String id;
    private String name;
    private String sex;
    private String phoneNum;
    private Integer credentialsType;
    private String credentialsTypeStr ; // 0 身份证  1 军官证  2 护照
    private String credentialsNum;
    private Integer travellerType;
    private String travellerTypeStr ; // 0 成人  1 儿童


    public String getCredentialsTypeStr() {
        credentialsTypeStr = "" ;
        if(credentialsType==0){
            credentialsTypeStr = "身份证";
        }
        if(credentialsType==1){
            credentialsTypeStr = "军官证";
        }
        if(credentialsType==2){
            credentialsTypeStr = "护照";
        }
        return credentialsTypeStr;
    }

    public String getTravellerTypeStr() {
        travellerTypeStr = "" ;
        if(travellerType==0){
            travellerTypeStr = "成人" ;
        }

        if(travellerType==1){
            travellerTypeStr = "儿童" ;
        }

        return travellerTypeStr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(Integer credentialsType) {
        this.credentialsType = credentialsType;
    }

    public String getCredentialsNum() {
        return credentialsNum;
    }

    public void setCredentialsNum(String credentialsNum) {
        this.credentialsNum = credentialsNum;
    }

    public Integer getTravellerType() {
        return travellerType;
    }

    public void setTravellerType(Integer travellerType) {
        this.travellerType = travellerType;
    }
}
