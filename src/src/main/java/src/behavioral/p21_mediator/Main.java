package src.behavioral.p21_mediator;

public class Main {
    public static void main(String[] args) {
        final ActionApplieMessage actionApplieMessage = new ActionApplieMessage();
        final Selectoptions selectoptions = new Selectoptions();
        final WarningMessage warningMessage = new WarningMessage();

        final Mediator mediator = new UserActionMediator(actionApplieMessage,
                selectoptions, warningMessage);

        selectoptions.sendRequest("load");
        System.out.println("----------------------------------");
        selectoptions.sendRequest("save");
        System.out.println("----------------------------------");
        selectoptions.sendRequest("restart");
        System.out.println("----------------------------------");
        warningMessage.sendRequest("hide");
    }
}
