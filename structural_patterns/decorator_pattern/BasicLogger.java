package decorator_pattern;

public class BasicLogger implements Logger{ 
    @Override     
    public String log(String msg) { 
        return msg; 
    }     
}