package com.qp.service;

import com.qp.pojo.YjptPdProduct;
import com.qp.pojo.YjptPdProductExample;
import com.qp.pojo.yangchun.ProductStatus;

import java.util.List;
import java.util.Map;

/**
 * Created by spring on 2019/6/28.
 */
public interface ProductService {

    public List<ProductStatus> selectNotStatus(Map<String,Object> map);

    public List<YjptPdProduct> selectAll();

    public int getRows();

    public int updateStatus(YjptPdProduct product);
}