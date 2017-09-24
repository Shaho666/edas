package com.edas.core.service;

import java.util.List;

import com.edas.commons.pojo.JsonResult;
import com.edas.orm.pojo.TbStudent;

public interface StudentService {

	public JsonResult insertStudent(TbStudent student);
	
	public List<TbStudent> getStudents();
	
	public List<TbStudent> getStudentsByIds(List<String> studentIds);
	
}
