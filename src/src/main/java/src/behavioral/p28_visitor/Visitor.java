package src.behavioral.p28_visitor;

public interface Visitor {
    void validdataFile(HTML4File html4File);
    void validdataFile(HTML5File html5File);
    void validdataFile(XHTMLFile xhtmlFile);
}
