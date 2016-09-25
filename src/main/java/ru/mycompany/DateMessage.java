package ru.mycompany;

import java.util.Date;

public class DateMessage {
    private Date date;
    private String message;
    //TODO:тут должна быть связка с Client
    private String senderName;

    public DateMessage(String message, String senderName) {
        this.date = new Date(System.currentTimeMillis());
        this.message = message;
        this.senderName = senderName;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
}
