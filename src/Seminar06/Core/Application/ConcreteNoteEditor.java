package Seminar06.Core.Application;

import Seminar06.Core.Application.Interfaces.NoteEditor;
import Seminar06.Core.Application.Interfaces.NotesDatabaseContext;
import Seminar06.Core.Application.Interfaces.NotesPresenter;
import Seminar06.Core.Domain.Note;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public class ConcreteNoteEditor implements NoteEditor {

    private final NotesPresenter notesPresenter;
    private final NotesDatabaseContext databaseContext;

    public ConcreteNoteEditor(NotesDatabaseContext databaseContext, NotesPresenter notesPresenter){
        this.databaseContext = databaseContext;
        this.notesPresenter = notesPresenter;
    }

    @Override
    public boolean add(Note item) {
        databaseContext.getAll().add(item);
        return databaseContext.saveChanges();
    }

    @Override
    public boolean edit(Note item) {
        if (item == null){
            return false;
        }
        Optional<Note> note = getById(item.getId());
        if (note.isEmpty()){
            return false;
        }
        note.get().setTitle(item.getTitle());
        note.get().setDetails(item.getDetails());
        note.get().setEditDate(new Date());
        return databaseContext.saveChanges();
    }

    @Override
    public boolean remove(Note item) {
        databaseContext.getAll().remove(item);
        return databaseContext.saveChanges();
    }

    @Override
    public Optional<Note> getById(Integer id) {
        return databaseContext.getAll().stream().filter(p -> p.getId() == id).findFirst();
    }

    @Override
    public Collection<Note> getAll() {
        return databaseContext.getAll();
    }

    @Override
    public void printAll() {
        notesPresenter.printAll(getAll());
    }
}
