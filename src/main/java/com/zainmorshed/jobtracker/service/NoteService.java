package com.zainmorshed.jobtracker.service;

import java.util.List;


// Update the import below to match the actual package of Note, for example:
import com.zainmorshed.jobtracker.model.Note;

public interface NoteService {
    Note saveNote(Note note);
    List<Note> getAllNotes();
    Note getNoteById(Long id);
    void deleteNote(Long id);
    Note updateNote(Long id, Note note);
}
