package com.rh.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/9/22.
 */
public class TTUDeviceValue {

    private String TTstatus;
    private String name;
    private String sn;
    private Integer amount;
    List<Object> TTUList;
//    List<Object> TTUList=new ArrayList();

    public String getTTstatus() {
        return TTstatus;
    }

    public void setTTstatus(String TTstatus) {
        this.TTstatus = TTstatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public List<Object> getTTUList() {
        return TTUList;
    }

    public void setTTUList(List<Object> TTUList) {
        this.TTUList = TTUList;
    }
}
