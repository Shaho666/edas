package com.edas.orm.mapper;

import com.edas.orm.pojo.TbPlace;
import com.edas.orm.pojo.TbPlaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPlaceMapper {
    int countByExample(TbPlaceExample example);

    int deleteByExample(TbPlaceExample example);

    int deleteByPrimaryKey(Integer placeId);

    int insert(TbPlace record);

    int insertSelective(TbPlace record);

    List<TbPlace> selectByExample(TbPlaceExample example);

    TbPlace selectByPrimaryKey(Integer placeId);

    int updateByExampleSelective(@Param("record") TbPlace record, @Param("example") TbPlaceExample example);

    int updateByExample(@Param("record") TbPlace record, @Param("example") TbPlaceExample example);

    int updateByPrimaryKeySelective(TbPlace record);

    int updateByPrimaryKey(TbPlace record);
}