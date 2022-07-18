package com.example;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class error<HttpServletRequest> implements ErrorController {

	@RequestMapping("/error")
	@ResponseBody
	String error(HttpServletRequest request) {
		return "<h1>存在错误请详细查看程式码</h1>";
	}

	public String getErrorPath() {
		return "/error";
	}
}