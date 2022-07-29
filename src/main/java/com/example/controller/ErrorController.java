package com.example.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Component
public class ErrorController implements ErrorViewResolver {

//	@RequestMapping("/error")
//	public String handleError() {
//		// do something like logging
//		return "error";
//	}
//	@RequestMapping("/error")
//	@ResponseBody
//	String error(HttpServletRequest request) {
//		return "<h1>存在错误请详细查看程式码</h1>";
//	}

	public String getErrorPath() {
		return "/error";
	}

	/**
	 * 实现ErrorViewResolver约定方法， 返回统一的错误视图.
	 * 
	 * @param request
	 * @param status
	 * @param model
	 * @return
	 */
	@Override
	public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
		return new ModelAndView("/error/index", model);
	}
}