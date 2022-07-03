package com.notesmanagement.backend.model;

import javax.persistence.Entity;

@Entity
public class NotePostRequest {
    String noteBody;

    public String getNoteBody() {
        return noteBody;
    }

    public void setNoteBody(String noteBody) {
        this.noteBody = noteBody;
    }
}
