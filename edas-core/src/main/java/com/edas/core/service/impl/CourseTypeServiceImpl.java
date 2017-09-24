package com.edas.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edas.core.service.CourseTypeService;
import com.edas.orm.mapper.TbCourseTypeMapper;
import com.edas.orm.pojo.TbCourseType;
import com.edas.orm.pojo.TbCourseTypeExample;
import com.edas.orm.pojo.TbCourseTypeExample.Criteria;

@Service
public class CourseTypeServiceImpl implements CourseTypeService {

	@Autowired
	private TbCourseTypeMapper courseTypeMapper;

	@Override
	public String getCourseTypeNameById(Integer courseTypeId) {

		TbCourseTypeExample example = new TbCourseTypeExample();

		Criteria criteria = example.createCriteria();
		criteria.andCourseTypeIdEqualTo(courseTypeId);

		List<TbCourseType> list = courseTypeMapper.selectByExample(example);
		if (list != null && list.size() == 1) {
			return list.get(0).getCourseTypeName();
		}

		return null;
	}

}
