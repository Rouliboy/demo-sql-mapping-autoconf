package com.example.demosql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexity.wgl.lib.utilctrl.dao.MyDao;
import com.nexity.wgl.lib.utilctrl.model.CompteurPOJO;

@RequestMapping("sql")
@RestController
public class MyController {

	@Autowired
	private MyService service;

	@Autowired
	private MyDao dao;

	@GetMapping("test")
	public String test() {
		return service.test();
	}

	@GetMapping("testMapping")
	public CompteurPOJO testMapping() {
		dao.test();
		return service.testMapping();
	}
}
