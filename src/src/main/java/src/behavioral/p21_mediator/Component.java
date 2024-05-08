package src.behavioral.p21_mediator;

public interface Component {
    void sendRequest();

    default void sendRequest(String context) {
        sendRequest();
    }
}
