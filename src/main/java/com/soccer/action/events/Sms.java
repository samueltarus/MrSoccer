package com.soccer.action.events;

import java.io.Serializable;

public class Sms implements Serializable {

    private String phoneNumber;
    private String message;

    public Sms() {
    }

    public Sms(String phoneNumber, String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
