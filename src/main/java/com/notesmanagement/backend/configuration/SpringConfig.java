package com.notesmanagement.backend.configuration;

import com.notesmanagement.backend.components.services.NoteRepository;
import com.notesmanagement.backend.components.services.PostgresNoteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public NoteRepository postgresNoteRepository() { return new PostgresNoteRepository(); }
}
