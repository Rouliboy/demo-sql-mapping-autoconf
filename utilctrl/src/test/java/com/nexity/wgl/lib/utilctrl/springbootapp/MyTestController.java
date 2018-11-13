package com.nexity.wgl.lib.utilctrl.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexity.wgl.lib.utilctrl.dao.MyTestService;
import com.nexity.wgl.lib.utilctrl.model.CompteurPOJO;

@RestController
@RequestMapping("test")
public class MyTestController {

	@Autowired
	private MyTestService testService;

	@GetMapping("test")
	public CompteurPOJO test() {
		return testService.testMapping();
	}
}
