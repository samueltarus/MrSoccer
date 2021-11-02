package com.soccer.action.events;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

@Stateless
public class Kimkim {

    @Asynchronous
    public void sendKimkimMsg(@Observes Sms sms)
    {
        System.out.println("Kimkim " + sms.getMessage());
    }

}
