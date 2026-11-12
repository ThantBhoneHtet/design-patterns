package factory_pattern.factory;

import factory_pattern.*;

public class MySQLFactory implements Factory {
    @Override
    public Database getDatabase() {
        return new MySQL();
    }  
}
