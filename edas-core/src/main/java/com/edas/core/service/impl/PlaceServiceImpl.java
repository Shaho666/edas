package com.edas.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edas.core.service.PlaceService;
import com.edas.orm.mapper.TbPlaceMapper;
import com.edas.orm.pojo.TbPlace;
import com.edas.orm.pojo.TbPlaceExample;
import com.edas.orm.pojo.TbPlaceExample.Criteria;

@Service
public class PlaceServiceImpl implements PlaceService {

	@Autowired
	private TbPlaceMapper placeMapper;

	@Override
	public String getPlaceNameById(Integer placeId) {

		TbPlaceExample example = new TbPlaceExample();

		Criteria criteria = example.createCriteria();
		criteria.andPlaceIdEqualTo(placeId);

		List<TbPlace> list = placeMapper.selectByExample(example);
		if (list != null && list.size() == 1) {
			return list.get(0).getPlaceName();
		}

		return null;
	}

}
