package adapter_pattern.obj_adapter;

import adapter_pattern.Gateway;
import adapter_pattern.KBZGateway;

public class KBZGatewayAdapter implements Gateway {
    
    private KBZGateway kbzGateway = new KBZGateway();

    @Override
    public void process() {
        kbzGateway.doKBZPayment();
    }
}
