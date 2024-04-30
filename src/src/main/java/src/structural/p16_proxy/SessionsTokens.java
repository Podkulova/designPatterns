package src.structural.p16_proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class SessionsTokens {
    private final Map<String, UUID> userNameToSessionToken = new HashMap<>();

    public Optional<UUID> getuserToken(final String userName) {
        return Optional.ofNullable(userNameToSessionToken.getOrDefault(userName, null));
    }

    public void createTokenForUser(final String userName) {
        userNameToSessionToken.put(userName, UUID.randomUUID());
    }
}
