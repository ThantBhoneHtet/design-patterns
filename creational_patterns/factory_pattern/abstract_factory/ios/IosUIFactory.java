package factory_pattern.abstract_factory.ios;

import factory_pattern.abstract_factory.AbstractUIFactory;
import factory_pattern.abstract_factory.Button;
import factory_pattern.abstract_factory.Label;

public class IosUIFactory implements AbstractUIFactory {

    @Override 
    public Button createButton() {
        return new IosButton();
    }

    @Override 
    public Label createLabel() {
        return new IosLabel();
    }
}
