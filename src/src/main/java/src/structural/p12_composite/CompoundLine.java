package src.structural.p12_composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundLine implements Line {
    private List<Line> lines = new ArrayList<>();
    @Override
    public void draw(int lengthInPixels) {
        lines.forEach(line -> line.draw(lengthInPixels));
    }

    @Override
    public void setStartPosition(Point position) {
        lines.forEach(line -> line.setStartPosition(position));
    }

    @Override
    public Point getStartPosition() {
        if (lines.isEmpty()) {
            return new Point(0,0);
        }
        return lines.get(0).getStartPosition();
    }

    public void addLine(Line line) {
        lines.add(line);
    }
    public void removeLine(Line line) {
        lines.remove(line);
    }
}
