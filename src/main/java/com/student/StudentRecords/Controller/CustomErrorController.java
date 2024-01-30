package com.student.StudentRecords.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController implements  ErrorController{

	@RequestMapping("/error")
	@ResponseBody
	String error(HttpServletRequest request) {
		return "<h1>error occired</h1>";
	}
	public String getErrorPath() {
		return"/error";
	}
}