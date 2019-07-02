package com.qp.easyuipojo;

import lombok.Data;

import java.util.List;

/**
 * @author liyan
 */
@Data
public class TreeNode {
    /**
     * 文件夹图标
     */
    public static final String ICON_FOLDER = "tree-folder";
    /**
     * 文件图标
     */
    public static final String ICON_FILE = "tree-file";
    private Integer id;
    private String text;
    private String iconCls;
    private Attributes attributes;
    private List<TreeNode> children;
}
