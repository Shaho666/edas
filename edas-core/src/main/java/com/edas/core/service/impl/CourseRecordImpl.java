package com.edas.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edas.core.service.CourseRecordService;
import com.edas.orm.mapper.TbCourseRecordMapper;
import com.edas.orm.pojo.TbCourseRecord;
import com.edas.orm.pojo.TbCourseRecordExample;
import com.edas.orm.pojo.TbCourseRecordExample.Criteria;

@Service
public class CourseRecordImpl implements CourseRecordService {

	@Autowired
	private TbCourseRecordMapper courseRecordMapper;

	@Override
	public List<TbCourseRecord> getCourseRecordByInstructorId(String instructorId) {

		TbCourseRecordExample example = new TbCourseRecordExample();

		Criteria criteria = example.createCriteria();
		criteria.andInstructorIdEqualTo(instructorId);

		List<TbCourseRecord> list = courseRecordMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list;
		}

		return null;
	}

}
