package Seminar06.Infrastructure;

import Seminar06.Core.Application.Interfaces.NotesDatabaseContext;
import Seminar06.Core.Domain.Note;
import Seminar06.Database.NotesDatabase;
import Seminar06.Database.NotesRecord;

import java.util.ArrayList;
import java.util.Collection;

public class DatabaseContext extends DBContext implements NotesDatabaseContext {

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }

    public DatabaseContext(Database database) {
        super(database);
    }

    @Override
    public Collection<Note> getAll() {
        Collection<Note> notesList = new ArrayList<>();
        //TODO: Симуляция внутреннего механизма Фреймворка
        for (NotesRecord record:((NotesDatabase)database).getNotesTable().getRecords()) {
            notesList.add(new Note(
                    record.getId(),
                    record.getUserID(),
                    record.getTitle(),
                    record.getDetails(),
                    record.getCreationDate()
            ));
        }
        return notesList;
    }
}
