package src.behavioral.p28_visitor;

public interface HTMLFile {
    String getDoctypeDeclaration();

    String getHead();

    String getBody();

    void accept(Visitor visitor);
}
