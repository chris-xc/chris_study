package com.itheima.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author 王磊
 * @Date 2019/8/13/013
 */
public class Orders {

    private String id;
    private String orderNum;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date orderTime;
    private String orderTimeStr;
    private int orderStatus;
    private String orderStatusStr;
    private int peopleCount;
    private Integer payType;
    private String payTypeStr; // 0 支付宝支付    1 微信支付    2 线下转账

    private String orderDesc;

    /**
     * 建立实体之间的映射关系
     */
    private Product product;

    /**
     * 建立订单和会员之间的实体映射
     * @return
     */
    private Member member ;

    /**
     * 建立订单和旅客之间的实体映射
     * @return
     */
    private List<Traveller> travellers ;

    public List<Traveller> getTravellers() {
        return travellers;
    }

    public void setTravellers(List<Traveller> travellers) {
        this.travellers = travellers;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }


    public String getPayTypeStr() {
        payTypeStr = "" ;

        if(payType==0){
            payTypeStr = "支付宝支付";
        }

        if(payType==1){
            payTypeStr = "微信支付";
        }

        if(payType==2){
            payTypeStr = "线下转账";
        }

        return payTypeStr;
    }

    public String getOrderTimeStr() {
        orderTimeStr = "" ;
        if(orderTime!=null){
            orderTimeStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(orderTime);
        }

        return orderTimeStr;
    }

    public String getOrderStatusStr() {
        orderStatusStr = "" ;
        if(orderStatus==0){
            orderStatusStr = "关闭";
        }
        if(orderStatus==1){
            orderStatusStr = "正常";
        }

        return orderStatusStr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }


    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }
}
