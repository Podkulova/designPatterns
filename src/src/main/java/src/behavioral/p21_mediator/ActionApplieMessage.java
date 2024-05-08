package src.behavioral.p21_mediator;

public class ActionApplieMessage implements Component {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void displayInfo() {
        System.out.println("Action was applied successfully.");
    }

    @Override
    public void sendRequest() {

    }
}
