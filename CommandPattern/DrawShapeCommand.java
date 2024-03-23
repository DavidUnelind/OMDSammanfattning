package CommandPattern;

public class DrawShapeCommand implements Command {
    private Shape shape;

    public DrawShapeCommand(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void execute() {
        shape.draw();
    }
}
