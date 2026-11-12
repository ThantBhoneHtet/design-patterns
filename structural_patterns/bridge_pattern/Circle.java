package bridge_pattern;

public class Circle extends Shape {
    public Circle(DrawingApi api) { 
        super(api); 
    } 
    @Override   
    void draw() { 
        api.drawCircle(); 
    }    
}
