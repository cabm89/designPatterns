package creational.factory.src.implementations;

import creational.factory.src.interfaces.IConnection;

public class SqlServerConnection implements IConnection {

    @Override
    public String connect() {
        return "Sql Server connection stablished";
    }

    @Override
    public String disconnect() {
        return "Sql Server connection closed";
    }
    
}
