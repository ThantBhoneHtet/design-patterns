package factory_pattern.abstract_factory.ios;

import factory_pattern.abstract_factory.Label;

public class IosLabel extends Label {
    
    @Override
    public void paint() {
        System.out.println("IOS Label painted");
    }
}
