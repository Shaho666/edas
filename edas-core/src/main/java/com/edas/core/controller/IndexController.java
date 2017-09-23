package com.edas.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edas.commons.pojo.JsonResult;

@Controller
public class IndexController {

	@RequestMapping("/index")
	@ResponseBody
	public JsonResult indexPage() {
		
		return JsonResult.ok();
	}
	
}
