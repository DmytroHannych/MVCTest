package com.goit.MVCTest;

import com.goit.MVCTest.Entity.Note;
import com.goit.MVCTest.Service.NoteService;
import com.goit.MVCTest.mvc.controller.TestControler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcTestApplication {

	public static void main(String[] args) {
		Note note = new Note(1l,"Test","Testing");
		Note note1 = new Note(2l,"Test1","Testing111");
		Note note2 = new Note(3l,"Test2","Testing222");
		NoteService noteService = new NoteService();
	     noteService.add(note);
		 noteService.add(note1);
		 noteService.add(note2);
		System.out.println("noteService.listAll() = " + noteService.listAll());
		SpringApplication.run(MvcTestApplication.class,args);
	}
}
