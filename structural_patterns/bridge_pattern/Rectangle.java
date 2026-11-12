package bridge_pattern;

public class Rectangle extends Shape {
    public Rectangle(DrawingApi api) { 
        super(api); 
    } 
    
    @Override   
    void draw() { 
        api.drawRectangle(); 
    }   
}
