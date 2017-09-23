package com.edas.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edas.commons.pojo.JsonResult;
import com.edas.commons.utils.ExceptionUtil;
import com.edas.core.pojo.Instructor;
import com.edas.core.service.InstructorService;
import com.edas.core.service.PlaceService;
import com.edas.orm.pojo.TbInstructor;

@Controller
@RequestMapping("/instructor")
public class InstructorController {

	@Autowired
	private InstructorService instructorService;

	@Autowired
	private PlaceService placeService;

	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	@ResponseBody
	public JsonResult validateInstructor(@RequestParam("instructorId") String instructorId,
			@RequestParam("instructorPassword") String instructorPassword) {

		Instructor instructor = null;

		try {

			TbInstructor tbInstructor = instructorService.validateInstructor(instructorId,
					DigestUtils.md5DigestAsHex(instructorPassword.getBytes()));
			instructor = new Instructor(tbInstructor, placeService.getPlaceNameById(tbInstructor.getInstructorPlace()));

		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}

		return JsonResult.ok(instructor);
	}

}
