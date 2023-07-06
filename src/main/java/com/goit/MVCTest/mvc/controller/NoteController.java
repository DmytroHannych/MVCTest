package com.goit.MVCTest.mvc.controller;

import com.goit.MVCTest.Entity.Note;
import com.goit.MVCTest.Service.NoteService;
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
    private final NoteService noteService;


    @PostMapping("/new")
    public String newNote(@ModelAttribute Note note, Model model) {
            model.addAttribute("note", note);
            noteService.add(note);
            return "redirect:/note/list";
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
    public String postUpdateNote(@ModelAttribute Note note) {
        System.out.println("edit controller");
        noteService.update(note);
        return "redirect:/note/list";
    }

  @GetMapping("/edit/{id}")
     public ModelAndView editNote(@RequestParam (name = "id") Long id){
      Note byId = noteService.getById(id);
      ModelAndView modelAndView = new ModelAndView("edit");
       modelAndView.addObject("note",byId);
       return modelAndView;
    }

     @DeleteMapping("/delete/{id}")
    public String deleteNote(@PathVariable ("id") Long id){
         System.out.println("delete controller");
         noteService.deleteById(id);
        return "redirect:/note/list";
    }


}
