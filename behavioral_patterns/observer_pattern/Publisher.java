package observer_pattern;

public interface Publisher { 
    public void attach(Subscriber subscriber); 
    public void change(String message); 
} 
