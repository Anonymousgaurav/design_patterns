package factory;

import factory.Components.AndroidButton;
import factory.Components.AndroidMenu;

public class AndroidUiFactory implements UIFactory{

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }
}
