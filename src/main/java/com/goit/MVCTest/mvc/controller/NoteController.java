package com.goit.MVCTest.mvc.controller;

import com.goit.MVCTest.Entity.Note;
import com.goit.MVCTest.Service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@RequiredArgsConstructor
@Controller
@RequestMapping("/note")
public class NoteController {
    private final NoteService noteService;


    public ModelAndView addNote(@RequestParam(name = "id") Long id, @RequestParam(name = "title") String title, @RequestParam(name = "conect") String conect){
        ModelAndView modelAndView = new ModelAndView("note");
        Note note = new Note(id,title,conect);
        modelAndView.addObject("note", noteService.add(note));
        return modelAndView;
    }
    @GetMapping("/list")
    public ModelAndView listAll() {
        System.out.println("Listing notes");
        List<Note> notes = noteService.listAll();
        ModelAndView noteList = new ModelAndView("note");
        noteList.addObject("notes", notes);
        return noteList;
    }

      @PostMapping("/edit")
     public String postUpdateNote( Note note){
         noteService.update(note);
         return "redirect:/note/list";
     }

//  @GetMapping("/edit")
//     public ModelAndView editNote(@RequestParam (name = "id") Long id){
//       ModelAndView modelAndView = new ModelAndView("edit");
//       modelAndView.addObject("note");
//       return modelAndView;
//    }

     @DeleteMapping("/delete/{id}")
    public String deleteNote(@PathVariable ("id") Long id){
         noteService.deleteById(id);
        return "redirect:/note/list";
    }


}
