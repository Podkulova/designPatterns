package src.structural.p12_composite;

public interface Line {
    void draw(int lengthInPixels);
    void setStartPosition(Point position);
    Point getStartPosition();
}
