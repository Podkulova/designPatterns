package src.structural.p12_composite;

public abstract class LineEditor {
    private static final CompoundLine compoundLine = new CompoundLine();

    public static void createLine(String type) {
        if (type.equals("dotted")) {
            compoundLine.addLine(new DottedLine());
        } else if (type.equals("solid")) {
            compoundLine.addLine(new SolidLine());
        } else {
            System.out.println("Unoknown type of line");
        }
    }

    public static void drawAllLinePoint(Point point) {
        compoundLine.setStartPosition(point);
        compoundLine.draw(10);
    }
}
