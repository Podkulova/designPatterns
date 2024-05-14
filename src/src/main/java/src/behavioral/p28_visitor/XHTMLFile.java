package src.behavioral.p28_visitor;

public class XHTMLFile implements HTMLFile {
    private final String head;
    private final String body;
    private final Visitor visitor;

    public XHTMLFile(String head, String body, Visitor visitor) {
        this.head = head;
        this.body = body;
        this.visitor = visitor;
    }

    @Override
    public String getDoctypeDeclaration() {
        return "<?xml version 1.0>";
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
