package com.edas.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edas.commons.pojo.JsonResult;
import com.edas.commons.utils.ExceptionUtil;
import com.edas.core.service.StudentService;
import com.edas.orm.mapper.TbStudentMapper;
import com.edas.orm.pojo.TbStudent;
import com.edas.orm.pojo.TbStudentExample;
import com.edas.orm.pojo.TbStudentExample.Criteria;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private TbStudentMapper studentMapper;

	@Override
	public JsonResult insertStudent(TbStudent student) {

		try {

			studentMapper.insert(student);

		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}

		return JsonResult.ok();
	}

	@Override
	public List<TbStudent> getStudents() {

		TbStudentExample example = new TbStudentExample();
		List<TbStudent> list = studentMapper.selectByExample(example);

		if (list != null && list.size() > 0) {
			return list;
		}

		return null;
	}

	@Override
	public List<TbStudent> getStudentsByIds(List<String> studentIds) {

		TbStudentExample example = new TbStudentExample();

		Criteria criteria = example.createCriteria();
		criteria.andStudentIdIn(studentIds);

		List<TbStudent> list = studentMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list;
		}

		return null;
	}

}
