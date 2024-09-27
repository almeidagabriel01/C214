package repositories;

import models.Note;
import java.util.List;

public interface NoteRepository {
    void addNote(Note note);
    List<Note> getAllNotes();
    void updateNote(int index, Note note);
    void deleteNote(int index);
}