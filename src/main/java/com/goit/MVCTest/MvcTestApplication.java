package com.goit.MVCTest;

import com.goit.MVCTest.Entity.Note;
import com.goit.MVCTest.Service.NoteService;
import com.goit.MVCTest.mvc.controller.TestControler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcTestApplication.class,args);
	}
}
