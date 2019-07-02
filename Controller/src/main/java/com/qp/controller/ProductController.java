package com.qp.controller;

import com.qp.easyuipojo.TableData;
import com.qp.pojo.YjptPdProduct;
import com.qp.pojo.yangchun.ProductStatus;
import com.qp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author spring
 * @Date 2019/6/28
 **/
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired(required = false)
    private ProductService productService;

   // @RequestMapping("/product")
    @RequestMapping("/selectall")
    @ResponseBody
    public TableData<ProductStatus> getAllNotStatusProduct(HttpServletRequest request){
        String name = request.getParameter("name");
        System.out.println("name="+name);
        Map<String,Object> map = new HashMap<>();
        map.put("name","%"+(name != null ? name : "")+"%");
        List<ProductStatus> list = productService.selectNotStatus(map);
        TableData<ProductStatus> tableData = new TableData<>();
        tableData.setTotal(productService.getRows());
        tableData.setRows(list);
        return tableData;
    }
    @GetMapping("/test")
    @ResponseBody
    public List<YjptPdProduct> testSelect() {
        return productService.selectAll();
    }

    @RequestMapping("/update")
    @ResponseBody
    public String updateStatus(YjptPdProduct product){
        System.out.println(productService.updateStatus(product));
        int res = productService.updateStatus(product);
        System.out.println(res);
        if (res == 1) { // 成功
            return "{\"success\":\"1\"}";
        } else { // 失败
            return "{\"errorMsg\":\"信息有误，修改失败\"}";
        }
    }
}
