package composite_pattern;

public class View extends UIWidget{ 
    public View(String id)   { 
        super(id); 
    } 
    
    @Override  
    void paint() { 
        System.out.println("Paint "+this.id); 
    }  
}