package com.qp.controller;

import com.qp.easyuipojo.TreeNode;
import com.qp.service.ProtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liyan
 */
@RestController
@RequestMapping("/Protype")
public class ProtypeController {

    @Autowired
    private ProtypeService protypeService;

    @RequestMapping(method = RequestMethod.POST)
    public List<TreeNode> getProtype() {
        return protypeService.getAllProtype();
    }
}
