package com.qp.pojo.com.qp.pojo.supe;

import com.qp.pojo.YjptPdProtype;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liyan
 * 携带子类型的类型
 */
@Data
public class ProtypeWithChild extends YjptPdProtype {
    private List<ProtypeWithChild> childs = new ArrayList<>();
}
