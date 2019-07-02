package com.qp.serviceimpl;

import com.qp.dao.YjptPdProtypeDao;
import com.qp.easyuipojo.TreeNode;
import com.qp.pojo.com.qp.pojo.supe.ProtypeWithChild;
import com.qp.service.ProtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liyan
 */
@Service
public class ProtypeServiceImpl implements ProtypeService {

    @Autowired
    private YjptPdProtypeDao protypeDao;

    @Override
    public List<TreeNode> getAllProtype() {
        final List<ProtypeWithChild> protypeWithChildList = protypeDao.selectAll();
        List<TreeNode> nodeList = new ArrayList<>();
        for (ProtypeWithChild protype : protypeWithChildList) {
            TreeNode treeNode = new TreeNode();
            treeNode.setId(protype.getTid());
            treeNode.setIconCls(TreeNode.ICON_FOLDER);
            treeNode.setText(protype.getTypename());
            List<TreeNode> treeNodesClass2 = new ArrayList<>();
            for (ProtypeWithChild protypeClass2 : protype.getChilds()) {
                TreeNode treeNodeClass2 = new TreeNode();
                treeNodeClass2.setId(protypeClass2.getTid());
                treeNodeClass2.setIconCls(TreeNode.ICON_FOLDER);
                treeNodeClass2.setText(protypeClass2.getTypename());
                List<TreeNode> treeNodesClass3 = new ArrayList<>();
                for (ProtypeWithChild protypeClass3 : protypeClass2.getChilds()) {
                    TreeNode treeNodeClass3 = new TreeNode();
                    treeNodeClass3.setId(protypeClass3.getTid());
                    treeNodeClass3.setText(protypeClass3.getTypename());
                    treeNodeClass3.setIconCls(TreeNode.ICON_FILE);
                    treeNodesClass3.add(treeNodeClass3);
                }
                treeNodeClass2.setChildren(treeNodesClass3);
                treeNodesClass2.add(treeNodeClass2);
            }
            treeNode.setChildren(treeNodesClass2);
            nodeList.add(treeNode);
        }
        return nodeList;
    }
        return null;
    }
}
