package src.behavioral.p17_command;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.open();
        doc.save();
        doc.close();

        System.out.println("---------------------------------");

        // Nastavíme command na ActionListenerCommand
        ActioonListenerCommand clickOpen = new ActionOpen(doc);
        ActioonListenerCommand clickSave = new ActionSave(doc);
        ActioonListenerCommand clickClose = new ActionClose(doc);

        MenuOptions menu = new MenuOptions(clickOpen, clickSave, clickClose);

        menu.clickOpen();
        menu.clickSave();
        menu.closeClick();
    }
}
