package src.behavioral.p17_command;

public class ActionOpen implements ActioonListenerCommand {
    private Document doc;

    public ActionOpen(Document doc) {

        this.doc = doc;
    }

    @Override
    public void execute() {

        doc.open();
    }
}
