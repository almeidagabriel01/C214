package repositories;

import models.Note;
import java.util.ArrayList;
import java.util.List;

public class NoteRepositoryMemory implements NoteRepository {
    private List<Note> notes = new ArrayList<>();

    @Override
    public void addNote(Note note) {
        if (note.getTitle() == null || note.getContent() == null) {
            throw new IllegalArgumentException("Title and content cannot be null");
        }
        notes.add(note);
    }

    @Override
    public List<Note> getAllNotes() {
        return notes;
    }

    @Override
    public void updateNote(int index, Note note) {
        if (index >= 0 && index < notes.size()) {
            notes.set(index, note);
        } else {
            throw new IndexOutOfBoundsException("Note index out of range");
        }
    }

    @Override
    public void deleteNote(int index) {
        if (index >= 0 && index < notes.size()) {
            notes.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Note index out of range");
        }
    }
}