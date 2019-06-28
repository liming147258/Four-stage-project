package com.qp.pojo.com.qp.pojo.supe;

import com.qp.pojo.YjptPdProtype;
import lombok.Data;

/**
 * @author liyan
 * 携带子类型的类型
 */
@Data
public class ProtypeWithChild extends YjptPdProtype {
    private YjptPdProtype child;
}
