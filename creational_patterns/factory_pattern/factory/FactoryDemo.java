package factory_pattern.factory;

import factory_pattern.Database;

public class FactoryDemo {
    public static void main(String[] args) {
        Factory oracleFactory = new OracleFactory();
        Database oracleDb = oracleFactory.getDatabase();
        oracleDb.openConnection();
    }
}
