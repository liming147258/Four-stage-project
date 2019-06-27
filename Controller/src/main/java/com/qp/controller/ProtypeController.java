package com.qp.controller;

import com.qp.easyuipojo.TreeNode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liyan
 */
@RestController("/protype")
public class ProtypeController {

    @RequestMapping(method = RequestMethod.GET)
    public List<TreeNode> getProtype() {
        return null;
    }
}
