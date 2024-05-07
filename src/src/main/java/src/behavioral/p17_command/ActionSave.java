package src.behavioral.p17_command;

public class ActionSave implements ActioonListenerCommand {
    private Document doc;
    public ActionSave(Document doc) {
        this.doc = doc;
    }
    @Override
    public void execute() {
        doc.save();
    }
}
