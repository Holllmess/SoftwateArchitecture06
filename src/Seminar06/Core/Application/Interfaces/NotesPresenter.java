package Seminar06.Core.Application.Interfaces;

import Seminar06.Core.Domain.Note;

import java.util.Collection;

public interface NotesPresenter {
    void printAll(Collection<Note> notes);
}
