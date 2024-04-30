package src.structural.p16_proxy;

public class Main {
    public static void main(String[] args) {
        TokenValidator tokenValidator = new TokenValidator();
        SessionsTokens sessionsTokens = new SessionsTokens();

        String userName = "Martin";
        String chanelName = "Design patterns";
        String message = "I can use design patterns.";
        sessionsTokens.createTokenForUser(userName);

        MessageSender messageSenderReal = new SlackmessageSender();
        System.out.println("Message sent by SlackMessageSender:");
        messageSenderReal.sendMessage(chanelName, userName, message);

        System.out.println("------------------------------------------");

        MessageSender messageSenderProxy = new SlackmessageSendProxy(messageSenderReal, sessionsTokens, tokenValidator);
        System.out.println("Message sent using proxy:");
        messageSenderProxy.sendMessage(chanelName, userName, message);
    }
}
