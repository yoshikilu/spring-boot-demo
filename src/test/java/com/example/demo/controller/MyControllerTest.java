package com.example.demo.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Spring Boot HelloWorldController 测试 - {@link MyController}
 *
 * Created by bysocket on 16/4/26.
 */
public class MyControllerTest {

	@Test
	public void testSayHello() {
		assertEquals("Hello World", new MyController().Hello());
	}
}
