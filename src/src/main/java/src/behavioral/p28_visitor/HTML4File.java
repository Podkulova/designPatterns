package src.behavioral.p28_visitor;

public class HTML4File implements HTMLFile {
    private final String head;
    private final String body;
    private final Visitor visitor;

    public HTML4File(String head, String body, Visitor visitor) {
        this.head = head;
        this.body = body;
        this.visitor = visitor;
    }

    @Override
    public String getDoctypeDeclaration() {
        return "<!DOCTTYPE HTML PUBLIC 4.01>";
    }

    @Override
    public String getHead() {
        return head;
    }

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.validdataFile(this);
    }
}
