package com.qp.serviceimpl;

import com.qp.dao.YjptPdProtypeDao;
import com.qp.easyuipojo.TreeNode;
import com.qp.service.ProtypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author liyan
 */
public class ProtypeServiceImpl implements ProtypeService {

    @Autowired
    private YjptPdProtypeDao protypeDao;

    @Override
    public List<TreeNode> getAllProtype() {
        return null;
    }
}
