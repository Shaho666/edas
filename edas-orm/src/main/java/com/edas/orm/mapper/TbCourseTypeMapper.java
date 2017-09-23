package com.edas.orm.mapper;

import com.edas.orm.pojo.TbCourseType;
import com.edas.orm.pojo.TbCourseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCourseTypeMapper {
    int countByExample(TbCourseTypeExample example);

    int deleteByExample(TbCourseTypeExample example);

    int deleteByPrimaryKey(Integer courseTypeId);

    int insert(TbCourseType record);

    int insertSelective(TbCourseType record);

    List<TbCourseType> selectByExample(TbCourseTypeExample example);

    TbCourseType selectByPrimaryKey(Integer courseTypeId);

    int updateByExampleSelective(@Param("record") TbCourseType record, @Param("example") TbCourseTypeExample example);

    int updateByExample(@Param("record") TbCourseType record, @Param("example") TbCourseTypeExample example);

    int updateByPrimaryKeySelective(TbCourseType record);

    int updateByPrimaryKey(TbCourseType record);
}