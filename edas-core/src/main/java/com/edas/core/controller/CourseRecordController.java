package com.edas.core.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edas.commons.pojo.JsonResult;
import com.edas.commons.utils.ExceptionUtil;
import com.edas.core.service.CourseRecordService;
import com.edas.core.service.CourseService;
import com.edas.core.service.InstructorService;
import com.edas.core.service.StudentService;
import com.edas.orm.pojo.TbCourse;
import com.edas.orm.pojo.TbCourseRecord;

@Controller
@RequestMapping("/courseRecord")
public class CourseRecordController {

	@Autowired
	private CourseRecordService courseRecordService;

	@Autowired
	private CourseService courseService;

	@Autowired
	private StudentService studentService;

	@Autowired
	private InstructorService instructorService;

	@RequestMapping("/findCoursesByInstructorId/{instructorId}")
	@ResponseBody
	public JsonResult findCoursesByInstructorId(@PathVariable("instructorId") String instructorId) {

		try {
			
			List<String> courseIds = new ArrayList<String>();
			
			List<TbCourseRecord> courseRecords = courseRecordService.getCourseRecordByInstructorId(instructorId);
			for (TbCourseRecord tbCourseRecord : courseRecords) {
				courseIds.add(tbCourseRecord.getCourseId());
			}
			
			Set<String> set = new HashSet<String>(courseIds);
			courseIds = new ArrayList<String>(set);

			List<TbCourse> courses = courseService.getCoursesByCourseIds(courseIds);
			
			return JsonResult.ok(courses);
			
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}

}
