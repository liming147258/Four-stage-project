package com.qp.easyuipojo;

import lombok.Data;

import java.util.List;

/**
 * @author liyan
 */
@Data
public class TreeNode {
    private Integer id;
    private String text;
    private String iconCls;
    private Attributes attributes;
    private List<TreeNode> children;
}
