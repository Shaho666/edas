package com.edas.orm.mapper;

import com.edas.orm.pojo.TbInstructor;
import com.edas.orm.pojo.TbInstructorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbInstructorMapper {
    int countByExample(TbInstructorExample example);

    int deleteByExample(TbInstructorExample example);

    int deleteByPrimaryKey(String instructorId);

    int insert(TbInstructor record);

    int insertSelective(TbInstructor record);

    List<TbInstructor> selectByExample(TbInstructorExample example);

    TbInstructor selectByPrimaryKey(String instructorId);

    int updateByExampleSelective(@Param("record") TbInstructor record, @Param("example") TbInstructorExample example);

    int updateByExample(@Param("record") TbInstructor record, @Param("example") TbInstructorExample example);

    int updateByPrimaryKeySelective(TbInstructor record);

    int updateByPrimaryKey(TbInstructor record);
}