package factory_pattern.abstract_factory.ios;

import factory_pattern.abstract_factory.Button;

public class IosButton extends Button {
    
    @Override
    public void paint() {
        System.out.println("IOS Button painted");
    }
}
