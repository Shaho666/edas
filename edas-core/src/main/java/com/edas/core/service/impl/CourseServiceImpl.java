package com.edas.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edas.core.service.CourseService;
import com.edas.orm.mapper.TbCourseMapper;
import com.edas.orm.pojo.TbCourse;
import com.edas.orm.pojo.TbCourseExample;
import com.edas.orm.pojo.TbCourseExample.Criteria;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private TbCourseMapper courseMapper;

	@Override
	public List<TbCourse> getCoursesByCourseIds(List<String> courseIds) {

		TbCourseExample example = new TbCourseExample();

		Criteria criteria = example.createCriteria();
		criteria.andCourseIdIn(courseIds);

		List<TbCourse> list = courseMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list;
		}

		return null;
	}

	@Override
	public List<TbCourse> getCourses() {

		TbCourseExample example = new TbCourseExample();

		return courseMapper.selectByExample(example);
	}

	@Override
	public String getCourseNameById(String courseId) {

		TbCourse course = courseMapper.selectByPrimaryKey(courseId);
		if (course != null) {
			return course.getCourseName();
		}

		return null;
	}

	@Override
	public TbCourse getCourseById(String courseId) {

		TbCourse course = courseMapper.selectByPrimaryKey(courseId);
		if (course != null) {
			return course;
		}

		return null;
	}

}
