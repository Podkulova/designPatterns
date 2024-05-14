package src.behavioral.p28_visitor;

public class HTMLFileValidator implements Visitor {

    @Override
    public void validdataFile(HTML4File html4File) {
        System.out.println("Validating HTML 4 schema...");
    }

    @Override
    public void validdataFile(HTML5File html5File) {
        System.out.println("Validating HTML 5 schema...");
    }

    @Override
    public void validdataFile(XHTMLFile xhtmlFile) {
        System.out.println("Validating XHTML schema...");
    }
}
