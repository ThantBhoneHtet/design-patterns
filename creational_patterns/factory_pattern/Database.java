package factory_pattern;

public interface Database { 
    void openConnection();
    void closeConnection();
    void executeQuery(String query);
} 