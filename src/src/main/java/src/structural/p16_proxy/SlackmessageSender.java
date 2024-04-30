package src.structural.p16_proxy;

import java.util.ArrayList;
import java.util.List;

public class SlackmessageSender implements MessageSender {
    private final List<Message> messages = new ArrayList<>();
    @Override
    public void sendMessage(String channnelName, String userName, String message) {
        final Message message1 = new Message(channnelName, userName, message);
        messages.add(message1);
        System.out.println("Send message: " + message1);
    }
}
