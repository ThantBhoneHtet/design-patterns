package factory_pattern.abstract_factory.android;

import factory_pattern.abstract_factory.Button;
import factory_pattern.abstract_factory.Label;
import factory_pattern.abstract_factory.AbstractUIFactory;

public class AndroidUIFactory implements AbstractUIFactory {

    @Override 
    public Button createButton() {
        return new AndrioidButton();
    }

    @Override 
    public Label createLabel() {
        return new AndroidLabel();
    }
}
