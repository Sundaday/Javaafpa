package com.sundaday.types;

import java.text.DateFormat;
import java.util.Date;

public class Message {

    private String title;
    private String txt;
    private Date date;
    private User user;

    public Message(String title, String txt, User user) {
        this.title = title;
        this.txt = txt;
        this.user = user;
        date = new Date();
    }

    @Override
    public String toString() {
        return "Message" +
                "title='" + title + '\n' +
                "txt='" + txt + '\n' +
                "date='" + getDate() + '\n' +
                "user=" + user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getDate() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        return df.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
