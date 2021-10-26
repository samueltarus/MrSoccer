package com.soccer.action.events;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

@Stateless
public class SmsEvent {

    @Asynchronous
    public void sendSms(@Observes Sms sms) {

        if (sms == null)
            return;

        System.out.println(sms.getPhoneNumber());
        System.out.println(sms.getMessage());
    }
}
