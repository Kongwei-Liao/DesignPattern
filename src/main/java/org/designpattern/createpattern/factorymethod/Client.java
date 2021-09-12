package org.designpattern.createpattern.factorymethod;

public class Client {
    Dialog dialog;

    private void initialize() {
        if("Windows".equals(System.getProperty("os.name"))) {
            dialog = new WindowsDialog();
        } else {
            dialog = new WebDialog();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.initialize();
        client.dialog.render();
    }
}
