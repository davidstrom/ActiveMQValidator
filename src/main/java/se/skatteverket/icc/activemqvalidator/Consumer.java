package se.skatteverket.icc.activemqvalidator;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "GUEST.mailbox", containerFactory = "myFactory")
    public void receiveMessage(AmqpMessage message) {
        System.out.println("Received <" + message + ">");
    }

}
