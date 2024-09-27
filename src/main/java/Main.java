import models.Note;
import repositories.NoteRepository;
import repositories.NoteRepositoryMemory;
import services.NoteService;

public class Main {
    public static void main(String[] args) {
        NoteRepository noteRepo = new NoteRepositoryMemory();
        NoteService noteService = new NoteService(noteRepo);

        // Adicionar notas
        noteService.addNote(new Note("Nota 1", "Conteúdo da nota 1"));
        noteService.addNote(new Note("Nota 2", "Conteúdo da nota 2"));
        noteService.addNote(new Note("Nota 3", "Conteúdo da nota 3"));

        // Listar notas
        System.out.println("Notas:");
        for (Note note : noteService.getAllNotes()) {
            System.out.println("- " + note.getTitle() + ": " + note.getContent());
        }

        // Atualizar nota
        noteService.updateNote(0, new Note("Nota 1 Atualizada", "Conteúdo atualizado"));

        // Remover nota
        noteService.deleteNote(1);

        // Listar notas após atualização
        System.out.println("\nNotas após atualização:");
        for (Note note : noteService.getAllNotes()) {
            System.out.println("- " + note.getTitle() + ": " + note.getContent());
        }
    }
}