package factory;


import factory.Components.Button;
import factory.Components.Menu;

public interface UIFactory {

    public Button createButton();
    public Menu createMenu();
}
