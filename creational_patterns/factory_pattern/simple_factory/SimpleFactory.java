package factory_pattern.simple_factory;

import factory_pattern.Database;
import factory_pattern.MySQL;
import factory_pattern.Oracle;

public class SimpleFactory {

    Database getDatabase(String type) {
        if (type.equalsIgnoreCase("mysql")) {
            return new MySQL();
        } else if (type.equalsIgnoreCase("oracle")) {
            return new Oracle();
        } else {
            throw new IllegalArgumentException("Unknown database type: " + type);
        }
    }
}
