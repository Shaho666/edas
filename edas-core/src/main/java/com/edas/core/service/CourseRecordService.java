package com.edas.core.service;

import java.util.List;

import com.edas.commons.pojo.JsonResult;
import com.edas.orm.pojo.TbCourseRecord;

public interface CourseRecordService {

	public List<TbCourseRecord> getCourseRecordByInstructorId(String instructorId);

	public List<TbCourseRecord> getCourseRecordByInstructorIdAndCourseId(String instructorId, String courseId);

	public JsonResult insertCourseRecord(TbCourseRecord courseRecord);

}
