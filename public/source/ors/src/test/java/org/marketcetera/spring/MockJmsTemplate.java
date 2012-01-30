package org.marketcetera.spring;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.JmsException;
import quickfix.Message;

import java.util.Vector;

/**
 * Mock object for a fake JMS Template where we record the incoming messages
 * @author toli
* @version $Id: MockJmsTemplate.java 3587 2008-04-24 23:38:47Z tlerios $
*/
public class MockJmsTemplate extends JmsTemplate {
    private Vector<Message> sentMessages = new Vector<Message>();
    public void convertAndSend(Object message) throws JmsException {
        sentMessages.add((Message)message);
    }

    public Vector<Message> getSentMessages() {
        return sentMessages;
    }
}
