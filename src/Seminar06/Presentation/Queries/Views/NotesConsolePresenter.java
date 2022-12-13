package Seminar06.Presentation.Queries.Views;

import Seminar06.Core.Application.Interfaces.NotesPresenter;
import Seminar06.Core.Domain.Note;

import java.util.Collection;

public class NotesConsolePresenter implements NotesPresenter {

    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note:notes) {
            System.out.println(note);
        }
    }
}
