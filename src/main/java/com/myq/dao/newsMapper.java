package com.myq.dao;

import com.myq.model.news;
import com.myq.model.newsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface newsMapper {
    int countByExample(newsExample example);

    int deleteByExample(newsExample example);

    int insert(news record);

    int insertSelective(news record);

    List<news> selectByExample(newsExample example);

    int updateByExampleSelective(@Param("record") news record, @Param("example") newsExample example);

    int updateByExample(@Param("record") news record, @Param("example") newsExample example);
}