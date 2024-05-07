package src.behavioral.p17_command;

public class MenuOptions {
    private ActioonListenerCommand openCommand;
    private ActioonListenerCommand saveCommand;
    private ActioonListenerCommand closeCommand;

    public MenuOptions(ActioonListenerCommand openCommand, ActioonListenerCommand saveCommand, ActioonListenerCommand closeCommand) {
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
        this.closeCommand = closeCommand;
    }

    public void clickOpen() {
        openCommand.execute();
    }

    public void clickSave() {
        saveCommand.execute();
    }

    public void closeClick() {
        closeCommand.execute();
    }
}
