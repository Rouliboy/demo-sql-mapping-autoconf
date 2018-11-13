package com.nexity.wgl.lib.utilctrl.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.nexity.wgl.lib.utilctrl.configuration.UtilCtrlConfiguration;
import com.nexity.wgl.lib.utilctrl.dao.MyDaoTest.TestConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { UtilCtrlConfiguration.class, TestConfig.class })
public class MyDaoTest {

	@Autowired
	private MyTestService testService;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void init() {

		System.out.println(testService.testMapping());

	}

	@Configuration
	@ImportResource("classpath:applicationContextIntegrationTest.xml")
	public static class TestConfig {

	}

}
