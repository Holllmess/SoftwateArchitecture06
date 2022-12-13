package Seminar06.Database;

import Seminar06.Infrastructure.Database;

public class NotesDatabase implements Database {

    private NotesTable notesTable = new NotesTable();

    public NotesTable getNotesTable(){
        return notesTable;
    }

}
