import models.Note;
import org.junit.Before;
import org.junit.Test;
import repositories.NoteRepositoryMemory;
import services.NoteService;

import static org.junit.Assert.assertEquals;

public class NoteServiceTest {
    NoteService noteService;
    NoteRepositoryMemory noteRepositoryMemory;

    @Before
    public void setup() {
        noteRepositoryMemory = new NoteRepositoryMemory();
        noteService = new NoteService(noteRepositoryMemory);
    }

    @Test
    public void testAddNote() {
        noteService.addNote(new Note("Nota 1", "Conteúdo da nota 1"));
        assertEquals(1, noteService.getAllNotes().size());
    }

    @Test
    public void testUpdateNote() {
        noteService.addNote(new Note("Nota 1", "Conteúdo da nota 1"));
        noteService.updateNote(0, new Note("Nota 1 Atualizada", "Conteúdo atualizado"));
        assertEquals("Nota 1 Atualizada", noteService.getAllNotes().get(0).getTitle());
    }

    @Test
    public void testDeleteNote() {
        noteService.addNote(new Note("Nota 1", "Conteúdo da nota 1"));
        noteService.addNote(new Note("Nota 2", "Conteúdo da nota 2"));
        noteService.deleteNote(0);
        assertEquals(1, noteService.getAllNotes().size());
    }
}