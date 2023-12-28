package factory;


import factory.Components.IosButton;
import factory.Components.IosMenu;

public class IosUiFactory implements UIFactory{

    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }
}

