package com.tae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tae.service.PushService;

@Controller
public class HomeController {
	@Autowired
	PushService pushService;

	@RequestMapping("/index")
	public String Start() {

		return "index";
	}

	@RequestMapping("/send")
	public String SendPush(@RequestParam("regid") String regid,
			@RequestParam("msg") String msg) {

		try {
			pushService.SendPush(regid, msg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:index";
	}
}
