package com.qp.controller;/**
 * Created by spring on 2019/7/1.
 */

import com.qp.easyuipojo.TableData;
import com.qp.pojo.yangchun.BuildingDong;
import com.qp.service.BuildingDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author spring
 * @Date 2019/7/1
 **/
@RestController
@RequestMapping("/building")
public class BuildingDongController {
    @Autowired
    private BuildingDongService buildingDongService;

    @GetMapping("/select")
    @ResponseBody
    public TableData<BuildingDong> selectAll(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        TableData<BuildingDong> tableData = new TableData<>();
        List<BuildingDong> list = buildingDongService.selectAll(map);
        tableData.setRows(list);
        tableData.setTotal(buildingDongService.getrows());
        return tableData;
    }
}
