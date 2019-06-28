package com.qp.easyuipojo;

import lombok.Data;

import java.util.List;

/**
 * @author liyan
 * EasyUI表格传输数据格式
 */
@Data
public class TableData<T> {
    private Integer total;
    private List<T> rows;
}
