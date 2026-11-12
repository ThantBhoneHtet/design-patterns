package adapter_pattern.class_adapter;

import adapter_pattern.Gateway;
import adapter_pattern.KBZGateway;

public class KBZGatewayAdapter extends KBZGateway implements Gateway {

    @Override 
    public void process() {
        super.doKBZPayment();
    }
}
