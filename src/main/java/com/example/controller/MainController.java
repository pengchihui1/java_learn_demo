package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Controller
public class MainController {
	// @RequestMapping(value = { "/", "/index.html" }, method = RequestMethod.GET)
	//// @ResponseBody
	// public String index() {
	// return "index";
	// }

	/**
	 * 拦截某个请求跳转固定位置
	 *
	 * @param registry
	 */

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/index.html").setViewName("index");
	}

}
