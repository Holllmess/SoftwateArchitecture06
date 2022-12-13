package Seminar06.Core.Domain;

import java.util.Date;

public class Note {
    private int userID;
    private int id;
    private String title;
    private String details;
    private Date createDate;
    private Date editDate;

    public int getUserID() {
        return userID;
    }

    public int getId() {
        return id;
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

    public Date getCreateDate() {
        return createDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public Note(int userID, int id, String title, String details, Date createDate) {
        this.userID = userID;
        this.id = id;
        this.title = title;
        this.details = details;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return String.format("[%d] - [%s] - [%s]", id, title, details);
    }
}
