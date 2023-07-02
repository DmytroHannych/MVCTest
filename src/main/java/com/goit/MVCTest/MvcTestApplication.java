package com.goit.MVCTest;

import com.goit.MVCTest.mvc.controller.TestControler;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcTestApplication {

	public static void main(String[] args) {
		TestControler testControler = new TestControler();
		testControler.getTest();
	}
}
