package com.notesmanagement.backend.components;

import com.notesmanagement.backend.components.services.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NoteManagement {
    NoteRepository noteRepo;

    public NoteManagement(@Autowired NoteRepository noteRepo) {
        this.noteRepo = noteRepo;
    }

    public String createNote(String noteBody) {
        return "";
    }
}
