package com.edas.orm.mapper;

import com.edas.orm.pojo.TbCourseRecord;
import com.edas.orm.pojo.TbCourseRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCourseRecordMapper {
    int countByExample(TbCourseRecordExample example);

    int deleteByExample(TbCourseRecordExample example);

    int deleteByPrimaryKey(String courseRecordId);

    int insert(TbCourseRecord record);

    int insertSelective(TbCourseRecord record);

    List<TbCourseRecord> selectByExample(TbCourseRecordExample example);

    TbCourseRecord selectByPrimaryKey(String courseRecordId);

    int updateByExampleSelective(@Param("record") TbCourseRecord record, @Param("example") TbCourseRecordExample example);

    int updateByExample(@Param("record") TbCourseRecord record, @Param("example") TbCourseRecordExample example);

    int updateByPrimaryKeySelective(TbCourseRecord record);

    int updateByPrimaryKey(TbCourseRecord record);
}