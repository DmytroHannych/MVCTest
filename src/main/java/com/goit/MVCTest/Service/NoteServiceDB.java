package com.goit.MVCTest.Service;

import com.goit.MVCTest.Entity.Note;
import com.goit.MVCTest.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class NoteServiceDB {
   private final NoteRepository noteRepository;

   public Note add(Note note){
        return noteRepository.save(note);
   }

   public void noteApdate(Note note){
      noteRepository.save(note);
   }

   public Note getById(long id){
      return noteRepository.getReferenceById(id);
   }

   public void deleteById(long id){
      noteRepository.deleteById(id);
   }

   public List<Note> allNote(){
      return noteRepository.findAll();
   }
}
