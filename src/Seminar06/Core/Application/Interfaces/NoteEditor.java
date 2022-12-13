package Seminar06.Core.Application.Interfaces;

import Seminar06.Core.Domain.Note;

public interface NoteEditor extends Editor<Note, Integer> {

    void printAll();
}
