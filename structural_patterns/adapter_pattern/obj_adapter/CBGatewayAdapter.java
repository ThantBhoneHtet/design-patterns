package adapter_pattern.obj_adapter;

import adapter_pattern.CBGateway;
import adapter_pattern.Gateway; 

public class CBGatewayAdapter implements Gateway {
    
    private CBGateway cbGateway = new CBGateway();

    @Override
    public void process() {
        cbGateway.doCBPayment();
    }
}
