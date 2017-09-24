package com.edas.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edas.core.service.InstructorService;
import com.edas.orm.mapper.TbInstructorMapper;
import com.edas.orm.pojo.TbInstructor;
import com.edas.orm.pojo.TbInstructorExample;
import com.edas.orm.pojo.TbInstructorExample.Criteria;

@Service
public class InstructorServiceImpl implements InstructorService {

	@Autowired
	private TbInstructorMapper instructorMapper;

	@Override
	public List<TbInstructor> getInstructors() {

		TbInstructorExample example = new TbInstructorExample();
		List<TbInstructor> list = instructorMapper.selectByExample(example);

		if (list != null && list.size() > 0) {
			return list;
		}

		return null;
	}

	@Override
	public TbInstructor validateInstructor(String instructorId, String instructorPassword) {

		TbInstructorExample example = new TbInstructorExample();

		Criteria criteria = example.createCriteria();
		criteria.andInstructorIdEqualTo(instructorId);
		criteria.andInstructorPasswordEqualTo(instructorPassword);

		List<TbInstructor> list = instructorMapper.selectByExample(example);
		if (list != null && list.size() == 1) {
			return list.get(0);
		}

		return null;
	}

	@Override
	public String getInstructorNameById(String instructorId) {

		TbInstructor instructor = instructorMapper.selectByPrimaryKey(instructorId);
		if (instructor != null) {
			return instructor.getInstructorName();
		}

		return null;
	}

}
