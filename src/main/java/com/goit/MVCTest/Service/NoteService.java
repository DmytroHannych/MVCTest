package com.goit.MVCTest.Service;
import com.goit.MVCTest.Entity.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteService {
    List<Note> notes = new ArrayList<Note>();

    public Note getById(long id){
       return notes.stream().
                filter(note -> note.getId()==id)
                .findFirst()
               .get();
    }

    public List<Note> listAll(){
        return  notes;
    }

    public Note add(Note note){
        note.setId(notes.size() + 1L);
         notes.add(note);
         return note;
    }

    public void deleteById(long id){
        notes.remove(notes.get((int) id));
    }

    public void update(Note note){
        Note updateNote = getById(note.getId());
        updateNote.setTitle(note.getTitle());
        updateNote.setContent(note.getContent());
    }
}
