package com.edas.core.service;

import java.util.List;

import com.edas.orm.pojo.TbInstructor;

public interface InstructorService {
	
	public List<TbInstructor> getInstructors();
	
	public TbInstructor validateInstructor(String instructorId, String instructorPassword);
	
}
