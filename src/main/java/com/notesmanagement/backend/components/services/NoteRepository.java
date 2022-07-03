package com.notesmanagement.backend.components.services;

import com.notesmanagement.backend.model.Note;
import org.springframework.stereotype.Service;

@Service
public interface NoteRepository {
    String storeNote(Note note);
}
