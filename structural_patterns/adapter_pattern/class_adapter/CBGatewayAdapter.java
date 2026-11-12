package adapter_pattern.class_adapter;

import adapter_pattern.CBGateway;
import adapter_pattern.Gateway;

public class CBGatewayAdapter extends CBGateway implements Gateway {
    @Override 
    public void process() {
        super.doCBPayment();
    }
}
