package com.nexity.wgl.lib.utilctrl.springbootapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Import;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.nexity.wgl.lib.utilctrl.configuration.UtilCtrlConfiguration;
import com.nexity.wgl.lib.utilctrl.model.CompteurPOJO;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@Import(UtilCtrlConfiguration.class)
public class MyTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void test() {

		final ResponseEntity<CompteurPOJO> c = restTemplate.getForEntity("/test/test", CompteurPOJO.class);
		throw new RuntimeException(c.getBody().toString());
	}
}
