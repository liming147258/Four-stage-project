package com.qp.dao;


import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TextDao {
    public List<TextPojo> getall();
}
