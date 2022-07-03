package com.notesmanagement.backend.components.services;

import com.notesmanagement.backend.model.Note;

public class PostgresNoteRepository implements NoteRepository {
    @Override
    public String storeNote(Note note) {
        return "1";
    }
}
