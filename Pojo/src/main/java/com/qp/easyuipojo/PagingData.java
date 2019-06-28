package com.qp.easyuipojo;

import lombok.Data;

/**
 * @author liyan
 * 用于接收EasyUI分页参数
 */
@Data
public class PagingData {
    /**
     * 当前页
     */
    private Integer page;
    /**
     * 每页行数
     */
    private Integer rows;
}
