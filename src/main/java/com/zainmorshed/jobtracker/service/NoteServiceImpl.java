package com.zainmorshed.jobtracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.zainmorshed.jobtracker.model.Note;
import com.zainmorshed.jobtracker.repository.NoteRepository;

@Service
public class NoteServiceImpl implements NoteService {
    
    private final NoteRepository noteRepository;

    @Autowired
    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note getNoteById(Long id){
        return noteRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteNote(Long id) {
        noteRepository.findById(id).ifPresent(noteRepository::delete);//noteRepository::delete means:
//“For whatever value is passed in, call the delete() method on noteRepository with it.”
//It's a method reference, and it's used as a cleaner alternative to writing full lambda expressions.
        //^this is the same as noteRepository.findById(id).ifPresent(note -> noteRepository.delete(note));
    }

    @Override
    public Note updateNote(Long id, Note note) {
            return noteRepository.findById(id).map(existingNote -> {
            existingNote.setTitle(note.getTitle());
            existingNote.setContent(note.getContent());
            return noteRepository.save(existingNote);
        }).orElse(null);
    }
}
        
        /*
         * Optional<Note> existingNote = noteRepository.findById(id);
        if(existingNote.isPresent()) {
            Note updateNote = existingNote.get();
            updateNote.setTitle(note.getTitle());
            updateNote.setContent(note.getContent());
            return noteRepository.save(updateNote);
        }
        else {
            return null;
        }
         */


