package src.behavioral.p17_command;

public class ActionClose implements  ActioonListenerCommand {
    private Document doc;

    public ActionClose(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.close();
    }
}
