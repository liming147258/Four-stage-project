package com.qp.serviceimpl;/**
 * Created by spring on 2019/7/1.
 */

import com.qp.dao.YjptPsBuildingDao;
import com.qp.service.BuildingDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;
import java.util.Map;

/**
 * @Author spring
 * @Date 2019/7/1
 **/
@Service("buildingDongService")
public class BuildingDongImpl implements BuildingDongService {
    @Autowired(required = false)
    private YjptPsBuildingDao buildingDao;

    @Override
    public List<com.qp.pojo.yangchun.BuildingDong> selectAll(Map<String, Object> map) {
        return buildingDao.selectAll(map);
    }

    @Override
    public int getrows() {
        return buildingDao.count();
    }
}
