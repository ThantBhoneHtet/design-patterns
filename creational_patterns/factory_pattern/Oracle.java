package factory_pattern;

public class Oracle implements Database {

    @Override
    public void closeConnection() {
        System.out.println("Closing Oracle connection");
        
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing Oracle query: " + query);
    }

    @Override
    public void openConnection() {
        System.out.println("Opening Oracle connection");
    }
    
}

