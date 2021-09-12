package org.designpattern.createpattern.factorymethod;

public abstract class Dialog {
    public abstract Button createButton();

    public void render() {
        Button okButton = createButton();
        okButton.onClick("closeDialog");
        okButton.render();
    }
}
