package factory_pattern.abstract_factory.android;

import factory_pattern.abstract_factory.Button;

public class AndrioidButton extends Button {
    
    @Override
    public void paint() {
        System.out.println("Android Button painted");
    }
}
