package com.edas.core.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edas.commons.pojo.JsonResult;
import com.edas.commons.utils.ExceptionUtil;
import com.edas.core.pojo.Course;
import com.edas.core.pojo.Student;
import com.edas.core.service.ClassService;
import com.edas.core.service.CourseRecordService;
import com.edas.core.service.CourseService;
import com.edas.core.service.CourseTypeService;
import com.edas.core.service.StudentService;
import com.edas.orm.pojo.TbCourse;
import com.edas.orm.pojo.TbCourseRecord;
import com.edas.orm.pojo.TbStudent;

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
	private ClassService classService;

	@Autowired
	private CourseTypeService courseTypeService;

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

			List<Course> courses = new ArrayList<Course>();

			List<TbCourse> tbCourses = courseService.getCoursesByCourseIds(courseIds);
			for (TbCourse tbCourse : tbCourses) {
				Course course = new Course(tbCourse, courseTypeService.getCourseTypeNameById(tbCourse.getCourseType()));
				courses.add(course);
			}

			return JsonResult.ok(courses);

		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}

	}

	@RequestMapping(value = "/findStudentsByInstructorIdAndCourseId", method = RequestMethod.POST)
	@ResponseBody
	public JsonResult findStudentsByInstructorIdAndCourseId(@RequestParam("instructorId") String instructorId,
			@RequestParam("courseId") String courseId) {

		try {
			List<String> studentIds = new ArrayList<String>();

			List<TbCourseRecord> courseRecords = courseRecordService.getCourseRecordByInstructorIdAndCourseId(instructorId,
					courseId);
			for (TbCourseRecord tbCourseRecord : courseRecords) {
				studentIds.add(tbCourseRecord.getStudentId());
			}

			List<Student> students = new ArrayList<Student>();

			List<TbStudent> tbStudents = studentService.getStudentsByIds(studentIds);
			for (TbStudent tbStudent : tbStudents) {
				Student student = new Student(tbStudent, classService.getClassNameById(tbStudent.getClassId()));
			    students.add(student);
			}

			return JsonResult.ok(students);
			
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

}
