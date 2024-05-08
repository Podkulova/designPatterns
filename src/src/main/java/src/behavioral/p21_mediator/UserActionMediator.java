package src.behavioral.p21_mediator;

public class UserActionMediator implements Mediator {
    private final ActionApplieMessage actionApplieMessage;
    private final Selectoptions selectoptions;
    private final WarningMessage warningMessage;

    public UserActionMediator(ActionApplieMessage actionApplieMessage, Selectoptions selectoptions, WarningMessage warningMessage) {
        this.actionApplieMessage = actionApplieMessage;
        this.selectoptions = selectoptions;
        this.warningMessage = warningMessage;
        actionApplieMessage.setMediator(this);
        selectoptions.setMediator(this);
        warningMessage.setMediator(this);
    }

    @Override
    public void sendInfo(Object requestor, String context) {
        if (requestor == actionApplieMessage) {
            actionApplieMessage.displayInfo();
            warningMessage.hideWarning();
            selectoptions.hideOptions();
        } else if (requestor == selectoptions) {
            switch (context) {
                case "load":
                    selectoptions.chooseLoad();
                    actionApplieMessage.displayInfo();
                    break;
                case "restart":
                    selectoptions.chooseRestart();
                    warningMessage.showWarningMessage();
                    break;
                case "save":
                    selectoptions.chooseSave();
                    actionApplieMessage.displayInfo();
                    break;
            }
        } else if (requestor == warningMessage) {
            if (context.equals("hide")) {
                warningMessage.hideWarning();
            } else {
                warningMessage.showWarningMessage();
            }
        }
    }
}
