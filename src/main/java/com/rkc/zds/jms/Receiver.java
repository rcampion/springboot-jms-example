package com.rkc.zds.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.rkc.zds.dto.EMail;

@Component
public class Receiver {

  @JmsListener(destination = "mailbox", containerFactory = "myFactory")
  public void receiveMessage(EMail email) {
    System.out.println("Received <" + email + ">");
  }

}
