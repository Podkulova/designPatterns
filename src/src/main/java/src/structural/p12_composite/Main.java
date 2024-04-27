package src.structural.p12_composite;

public class Main {
    public static void main(String[] args) {
        LineEditor.createLine("dotted");
        LineEditor.createLine("solid");
        LineEditor.createLine("dotted");
        LineEditor.drawAllLinePoint(new Point(5,5));

    }
}
