package com.edas.core.service;

import java.util.List;

import com.edas.orm.pojo.TbCourse;

public interface CourseService {
	
	public List<TbCourse> getCoursesByCourseIds(List<String> courseIds);
	
	public List<TbCourse> getCourses();
	
}
