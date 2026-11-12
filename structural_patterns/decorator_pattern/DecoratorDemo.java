package decorator_pattern;

public class DecoratorDemo { 
    public static void main(String[] args) { 
        Logger lg = new HTMLDecorator(new TimeDecorator(new BasicLogger())); 
        String msg = lg.log("LogString"); 
        System.out.println(msg); 
    }
}
