package factory_pattern.simple_factory;

import factory_pattern.Database;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Database dbConnector = factory.getDatabase("oracle");

        dbConnector.openConnection();
        dbConnector.executeQuery("SELECT * FROM users");
        dbConnector.closeConnection();
    }
}
