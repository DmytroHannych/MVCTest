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
