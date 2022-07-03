package com.notesmanagement.backend.controller;

import com.notesmanagement.backend.components.NoteManagement;
import com.notesmanagement.backend.model.NotePostRequest;
import com.notesmanagement.backend.model.PostOkayResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesController {

    @Autowired
    NoteManagement noteManager;

    @PostMapping("/notes")
    ResponseEntity<PostOkayResponse> postNote(@RequestBody NotePostRequest request) {
        HttpStatus httpStatus;
        PostOkayResponse response;
        try {
            String id = noteManager.createNote(request.getNoteBody());
            response = new PostOkayResponse(id);
            httpStatus = HttpStatus.valueOf(200);
        } catch(Exception e) {
            response = null;
            httpStatus = HttpStatus.valueOf(500);
        }
        return new ResponseEntity<>(response, httpStatus);
    }
}
