package factory_pattern;

public class MySQL implements Database {

    @Override
    public void closeConnection() {
        System.out.println("Closing MySQL connection");
        
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing MySQL query: " + query);
    }

    @Override
    public void openConnection() {
        System.out.println("Opening MySQL connection");
    }
    
}
