package com.goit.MVCTest.Service;
import com.goit.MVCTest.Entity.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteService {
    List<Note> notes = new ArrayList<Note>();

    public Note getById(long id){
        Note note = notes.get((int) id);
        return note;
    }

    public List<Note> listAll(){
        return  notes;
    }

    public Note add(Note note){
         notes.add(note);
         return note;
    }

    public void deleteById(long id){

        notes.remove(notes.get((int)id));
    }

    public void update(Note note){
        Note updateNote = getById(note.getId());
        updateNote.setTitle(note.getTitle());
        updateNote.setContent(note.getContent());
    }
}
