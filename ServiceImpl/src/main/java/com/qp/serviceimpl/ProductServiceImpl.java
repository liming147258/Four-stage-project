package com.qp.serviceimpl;

import com.qp.dao.YjptPdProductDao;
import com.qp.pojo.YjptPdProduct;
import com.qp.pojo.YjptPdProductExample;
import com.qp.pojo.yangchun.ProductStatus;
import com.qp.service.ProductService;
import jdk.net.SocketFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resources;
import java.util.List;
import java.util.Map;

/**
 * @Author spring
 * @Date 2019/6/28
 */
@Service("productService")
public class ProductServiceImpl implements ProductService{

    @Autowired(required = false)
    private YjptPdProductDao productDao;

    @Override
    public List<ProductStatus> selectNotStatus(Map<String,Object> map) {
        return productDao.selectNotStatus(map);
    }

    @Override
    public List<YjptPdProduct> selectAll() {
        return null;
    }
    @Override
    public int getRows() {
        /*Integer row = productDao.count();
        if(row == null){
            return 0;
        }
        return row;*/
        return productDao.count();
    }

    @Override
    public int updateStatus(YjptPdProduct product) {
        return productDao.updateStatus(product);
    }


}
