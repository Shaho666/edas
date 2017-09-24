package com.edas.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edas.core.service.ClassService;
import com.edas.orm.mapper.TbClassMapper;
import com.edas.orm.pojo.TbClass;

@Service
public class ClassServiceImpl implements ClassService {

	@Autowired
	private TbClassMapper classMapper;
	
	@Override
	public String getClassNameById(Integer classId) {
		
		TbClass clazz = classMapper.selectByPrimaryKey(classId);
		
		return clazz.getClassName();
	}

}
