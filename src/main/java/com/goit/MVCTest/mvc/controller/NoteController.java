package com.goit.MVCTest.mvc.controller;

import com.goit.MVCTest.Entity.Note;
import com.goit.MVCTest.Service.NoteService;
import com.goit.MVCTest.Service.NoteServiceDB;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@RequiredArgsConstructor
@Controller
@RequestMapping("/note")
public class NoteController {
//    private final NoteService noteService;
    private final NoteServiceDB noteServiceDB;


    @PostMapping("/new")
    public String newNote(@ModelAttribute Note note, Model model) {
            noteServiceDB.add(note);
            model.addAttribute("note", note);
            return "redirect:/note/list";
    }

    @GetMapping("/list")
    public ModelAndView listAll() {
        System.out.println("Listing notes");
        List<Note> notes = noteServiceDB.allNote();
        ModelAndView noteList = new ModelAndView("note");
        noteList.addObject("notes", notes);
        return noteList;
    }

    @PostMapping("/edit")
    public String postUpdateNote(@ModelAttribute Note note) {
        System.out.println("edit controller");
        noteServiceDB.add(note);
        return "redirect:/note/list";
    }

  @GetMapping("/edit")
     public String editNote(@RequestParam ("id") Long id, Model model){
      Note byId = noteServiceDB.getById(id);
      model.addAttribute("note",byId);
      return "edit";
    }

     @PostMapping("/delete")
    public String deleteNote(@RequestParam ("id") long id){
        noteServiceDB.deleteById(id);
        return "redirect:/note/list";
    }
}
