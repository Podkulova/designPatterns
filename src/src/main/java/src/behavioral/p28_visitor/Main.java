package src.behavioral.p28_visitor;

public class Main {
    public static void main(String[] args) {
        final Visitor visitor = new HTMLFileValidator();

        final HTML4File html4File = new HTML4File("<head><title>Title</title></head>",
                "<body><H1>Header</H1></body>",
                visitor);


        final HTML5File html5File = new HTML5File("<head><title>Title HTML5</title></head>",
                "<body><H1>Header</H1></body>",
                visitor);

        final XHTMLFile xhtmlFile = new XHTMLFile("<head><title>Title XHTML</title></head>",
                "<body><H1>Header</H1></body>",
                visitor);

        visitor.validdataFile(html4File);
        visitor.validdataFile(html5File);
        visitor.validdataFile(xhtmlFile);
    }
}
