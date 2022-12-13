package Seminar06;

import Seminar06.Core.Application.ConcreteNoteEditor;
import Seminar06.Database.NotesDatabase;
import Seminar06.Infrastructure.DatabaseContext;
import Seminar06.Presentation.Queries.Controllers.NotesController;
import Seminar06.Presentation.Queries.Views.NotesConsolePresenter;

public class Main {

    /**
     * App "Редактор заметок"
     */

    public static void main(String[] args) {
        NotesController notesController = new NotesController(
                new ConcreteNoteEditor(new DatabaseContext(new NotesDatabase()), new NotesConsolePresenter())
        );

        notesController.routeGetAll();
    }
}
