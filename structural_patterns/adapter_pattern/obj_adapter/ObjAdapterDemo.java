package adapter_pattern.obj_adapter;

import adapter_pattern.Gateway;

public class ObjAdapterDemo {
    public static void main(String[] args) {
        Gateway kbzGateway = new KBZGatewayAdapter();
        Gateway cbGateway = new CBGatewayAdapter();
        
        kbzGateway.process();
        cbGateway.process();
    }
}
