package com.engineer135.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	@RequestMapping("/showMessage")
	public String showMessage(Model model){
		System.out.println("이건 타나?");
		model.addAttribute("message", "welcome spring4");
		return "showMessage";
	}
	
	@RequestMapping("/ajaxTest")
	@ResponseBody
	public Map<String,Object> ajaxTest(){
		System.out.println("ajax 들어옴");
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("test", "ajax gogo");
		return resultMap;
	}
}
