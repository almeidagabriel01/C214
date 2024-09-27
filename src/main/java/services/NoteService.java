package services;

import models.Note;
import repositories.NoteRepository;
import java.util.List;

public class NoteService {
    private NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public void addNote(Note note) {
        noteRepository.addNote(note);
    }

    public List<Note> getAllNotes() {
        return noteRepository.getAllNotes();
    }

    public void updateNote(int index, Note note) {
        noteRepository.updateNote(index, note);
    }

    public void deleteNote(int index) {
        noteRepository.deleteNote(index);
    }
}