package com.qp.pojo.yangchun;/**
 * Created by spring on 2019/7/1.
 */

import com.qp.pojo.YjptPsBuilding;
import com.qp.pojo.YjptPsPropertiesSale;
import lombok.Data;

import java.util.List;

/**
 * @Author spring
 * @Date 2019/7/1
 **/
@Data
public class BuildingDong extends YjptPsBuilding {
    private String propertiesname;
    private String design;
}
