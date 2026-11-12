package factory_pattern.factory;

import factory_pattern.Database;
import factory_pattern.Oracle;

public class OracleFactory implements Factory {
    @Override
    public Database getDatabase() {
        return new Oracle();
    }
}
