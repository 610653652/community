package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @program: community
 * @description: Test
 * @author: Mr.Ricardo
 * @create: 2023-03-12 16:03
 **/
@Repository
@Primary
public class AlphaDaoMyBatisImpl implements AlphaDao{
    public String select() {
        return "MyBatis";
    }
}
