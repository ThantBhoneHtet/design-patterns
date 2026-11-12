package bridge_pattern;

public abstract class Shape {
    DrawingApi api;

    Shape(DrawingApi api) {
        this.api = api;
    }

    abstract void draw();
}
