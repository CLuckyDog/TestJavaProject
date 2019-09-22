package com.rh.test;

import com.alibaba.fastjson.JSONObject;
import com.rh.entity.GasDeviceValue;
import com.rh.entity.TTUDeviceValue;
import com.rh.view.GasDeviceView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/9/22.
 */
public class TestView {
    public static void main(String[] args) {

        GasDeviceValue dValue=new GasDeviceValue();
        TTUDeviceValue tValue=new TTUDeviceValue();

        Map<String,Object> weekTrend=new HashMap<>();
        List<Object> TTUList=new ArrayList();

        weekTrend.put("a","aaaa");
        weekTrend.put("b","bbbb");
        weekTrend.put("v","vvvv");
        weekTrend.put("d","dddd");
        weekTrend.put("s","ssss");

        TTUList.add("XXXX");
        TTUList.add("YYYY");
        TTUList.add("ZZZZ");
        TTUList.add("AAAA");
        TTUList.add("GGGG");

        dValue.setAmount(100);
        dValue.setName("keyBoard");
        dValue.setSn("1111111");
        dValue.setStatus("0");
        dValue.setWeekTrend(weekTrend);

        tValue.setAmount(101);
        tValue.setName("TTU");
        tValue.setSn("222222");
        tValue.setTTstatus("1");
        tValue.setTTUList(TTUList);

        GasDeviceView view =new GasDeviceView();
        view.setPageIndex("0");
        view.setPageSize("10");

        List<Object> dataList=new ArrayList<>();
        dataList.add(dValue);
        view.setDataList(dataList);

        JSONObject jsonObject = new JSONObject();
        System.out.println("dValue---------"+jsonObject.toJSONString(view));//通过toJSONString( )将实体类转化成json对象

        List<Object> dataList1=new ArrayList<>();
        dataList1.add(tValue);
        view.setDataList(dataList1);
        System.out.println("tValue-----------"+jsonObject.toJSONString(view));//通过toJSONString( )将实体类转化成json对象

        Map<String, String> keyMap = new HashMap<String, String>();
        keyMap.put("dataList", "deviceInfoList");
        JSONObject jsonObj = JSONUtil.changeJsonObj(JSONObject.parseObject(jsonObject.toJSONString(view)),keyMap);

        System.out.println("换值结果 》》 " + jsonObj.toString());
    }
}
