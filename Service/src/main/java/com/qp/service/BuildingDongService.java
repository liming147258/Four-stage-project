package com.qp.service;

import java.util.List;
import java.util.Map;

/**
 * Created by spring on 2019/7/1.
 */
public interface BuildingDongService {
    List<com.qp.pojo.yangchun.BuildingDong> selectAll(Map<String,Object> map);

    int getrows();
}

