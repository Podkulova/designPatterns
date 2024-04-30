package src.structural.p16_proxy;

import java.util.Optional;
import java.util.UUID;

public class SlackmessageSendProxy implements MessageSender {
    private final MessageSender messageSender;
    private final SessionsTokens sessionsTokens;
    private final TokenValidator tokenValidator;

    public SlackmessageSendProxy(MessageSender messageSender, SessionsTokens sessionsTokens, TokenValidator tokenValidator) {
        this.messageSender = messageSender;
        this.sessionsTokens = sessionsTokens;
        this.tokenValidator = tokenValidator;
    }

    @Override
    public void sendMessage(String channnelName, String userName, String message) {
        final Optional<UUID> userTokenOptional = sessionsTokens.getuserToken(userName);

        if (userTokenOptional.isPresent()) {
            final UUID existingToken = userTokenOptional.get();
            if (!tokenValidator.isExpired(existingToken)) {
                messageSender.sendMessage(channnelName, userName, message);
            } else {
                System.out.println("Message from user " + userName + " not sent because of expired token.");
            }
        } else {
            System.out.println("Message from user " + userName + " not sent because of no valid taken.");
        }
    }
}
