package org.designpattern.createpattern._2_abstractfactory;

public class Application {
    private GUIFactory guiFactory;
    private Button button;

    public Application(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }

    public void createUI() {
        this.button = guiFactory.createButton();
    }

    public void paint() {
        button.paint();
    }
}
