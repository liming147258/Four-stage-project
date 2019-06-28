package com.qp.easyuipojo;

import lombok.Data;

import java.util.List;

/**
 * @author liyan
 * EasyUI表格传输数据格式
 */
@Data
public class TableData<T> {
    /**
     * 总行数
     */
    private Integer total;
    /**
     * 数据
     */
    private List<T> rows;
}
