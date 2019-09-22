package com.rh.view;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/9/22.
 */
public class GasDeviceView {
    private String pageIndex;
    private String pageSize;
    List<Object> dataList;
//    List<Object> dataList=new ArrayList<>();

    public GasDeviceView() {
    }

    public String getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public List<Object> getDataList() {
        return dataList;
    }

    public void setDataList(List<Object> dataList) {
        this.dataList = dataList;
    }
}
