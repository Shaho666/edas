package com.edas.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edas.commons.pojo.JsonResult;
import com.edas.commons.utils.ExceptionUtil;
import com.edas.commons.utils.JsonUtils;
import com.edas.core.pojo.Course;
import com.edas.core.service.CourseService;
import com.edas.core.service.CourseTypeService;
import com.edas.orm.pojo.TbCourse;

@Controller
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@Autowired
	private CourseTypeService courseTypeService;

	@RequestMapping("/getCourseById/{courseId}")
	@ResponseBody
	public JsonResult getCourseById(@PathVariable("courseId") String courseId) {

		try {
			
			TbCourse tbCourse = courseService.getCourseById(courseId);
			Course course = new Course(tbCourse, courseTypeService.getCourseTypeNameById(tbCourse.getCourseType()));

			String json = JsonUtils.objectToJson(course);
			return JsonResult.ok(json);
			
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

}
