package Seminar06.Database;

import java.util.Date;
import java.util.SplittableRandom;

public class NotesRecord {
    private static int counter;
    private int userID;
    private int id;
    private String title;
    private String details;
    private Date creationDate;
    private Date editDate;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        NotesRecord.counter = counter;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    {
        id = ++counter;
        userID = 20001;
    }

    public NotesRecord(String title, String details) {
        this.title = title;
        this.details = details;
        this.creationDate = new Date();
    }
}
