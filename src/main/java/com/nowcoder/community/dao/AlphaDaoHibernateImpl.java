package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @program: community
 * @description: Test
 * @author: Mr.Ricardo
 * @create: 2023-03-12 16:01
 **/
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    public String select() {
        return "Hibernate";
    }
}
