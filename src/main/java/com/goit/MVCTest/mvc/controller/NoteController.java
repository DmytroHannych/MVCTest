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
    public ModelAndView getAllNotes(){
         ModelAndView result = new ModelAndView("note");
         result.addObject("note", noteService.listAll());
         return result;
     }

      @PostMapping()
     public ModelAndView postUpdateNote( Note note){
         ModelAndView result = new ModelAndView("note");
         result.addObject("note",noteService.update(note));
         return result;
     }

     @DeleteMapping("/delete/{id}")
    public String deleteNote(@PathVariable ("id") Long id){
         noteService.deleteById(id);
        return "redirect:/note/list";
    }


}
