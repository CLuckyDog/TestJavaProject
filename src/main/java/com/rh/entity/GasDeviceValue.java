package com.rh.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/9/22.
 */
public class GasDeviceValue {

    private String status;
    private String name;
    private String sn;
    private Integer amount;
    Map<String,Object> weekTrend;
//    Map<String,Object> weekTrend=new HashMap<>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Map<String, Object> getWeekTrend() {
        return weekTrend;
    }

    public void setWeekTrend(Map<String, Object> weekTrend) {
        this.weekTrend = weekTrend;
    }
}
