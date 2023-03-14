package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: community
 * @description: discuss_post实体类对应Mapper
 * @author: Mr.Ricardo
 * @create: 2023-03-14 14:47
 **/
@Mapper
public interface DiscussPostMapper {
    //offset:起始页,limit:每页多少数量
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //表内多少条数据,如果需要动态使用(<if>),且这个方法只有一个条件,则参数需要加 @Param("别名")
    int selectDiscussPostRows(@Param("userId") int userId);


}
