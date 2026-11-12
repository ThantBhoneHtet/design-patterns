package factory_pattern.abstract_factory;

import factory_pattern.abstract_factory.android.AndroidUIFactory;
import factory_pattern.abstract_factory.ios.IosUIFactory;

public class AbstractFactoryDemo {
   public static void main(String[] args) {
        AbstractUIFactory uiFactory = new AndroidUIFactory();
        uiFactory = new IosUIFactory();

        Button button = uiFactory.createButton();
        button.paint();

        Label label = uiFactory.createLabel();
        label.paint();
   }
}
