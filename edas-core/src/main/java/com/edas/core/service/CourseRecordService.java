package com.edas.core.service;

import java.util.List;

import com.edas.orm.pojo.TbCourseRecord;

public interface CourseRecordService {

	public List<TbCourseRecord> getCourseRecordByInstructorId(String instructorId);
	
}
