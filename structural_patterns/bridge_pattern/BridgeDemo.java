package bridge_pattern;

public class BridgeDemo {
    public static void main(String[] args) { 
        DrawingApi api = new SvgApi();    
        Shape s = new Rectangle(api); 
        s.draw(); 
        api = new CanvasApi(); 
        s = new Circle(api); 
        s.draw();
    }
}
