package adapter_pattern.class_adapter;

import adapter_pattern.Gateway;

public class ClassAdapterDemo {
    public static void main(String[] args) {
        Gateway kbzGateway = new KBZGatewayAdapter();
        Gateway cbGateway = new CBGatewayAdapter();
        
        kbzGateway.process();
        cbGateway.process();
    }
}
