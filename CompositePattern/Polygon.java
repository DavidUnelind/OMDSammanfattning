package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Polygon implements Shape {
    private List<Line> lines;

    public Polygon() {
        this.lines = new ArrayList<Line>();
    }

    public void addLine(Line line) {
        lines.add(line);
    }

    @Override
    public void draw() {
        for (Line line : lines) {
            line.draw();
        }
    }
}