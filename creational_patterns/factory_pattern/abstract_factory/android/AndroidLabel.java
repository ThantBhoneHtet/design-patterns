package factory_pattern.abstract_factory.android;

import factory_pattern.abstract_factory.Label;

public class AndroidLabel extends Label {
    
    @Override
    public void paint() {
        System.out.println("Android Label painted");
    }
}
