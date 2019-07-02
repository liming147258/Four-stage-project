package com.qp.pojo.yangchun;

import com.qp.pojo.YjptPdProdetail;
import com.qp.pojo.YjptPdProduct;
import com.qp.pojo.YjptPnApplyPartner;
import lombok.Data;

import java.util.List;


/**
 * Created by spring on 2019/6/28.
 */
@Data
public class ProductStatus extends YjptPdProduct{

    private YjptPdProdetail prodetail;

    private List<YjptPnApplyPartner> partner;

    private List<YjptPnApplyPartner> partner1;

    private String path;

    private String enterpriseName;

}








