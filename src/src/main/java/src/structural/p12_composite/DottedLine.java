package src.structural.p12_composite;

public class DottedLine implements Line{
    private Point startPoint = new Point(0,0);
    @Override
    public void draw(int lengthInPixels) {
        System.out.println("Drowing dotted line starting at " + startPoint + ":");
        for (int i = 0; i < startPoint.getX(); i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < lengthInPixels; i++) {
            System.out.print(".");
        }
        System.out.println();
        for (int i = 0; i < startPoint.getY(); i++) {
            System.out.println();
        }
    }

    @Override
    public void setStartPosition(Point position) {
        startPoint = position;
    }

    @Override
    public Point getStartPosition() {
        return startPoint;
    }
}
