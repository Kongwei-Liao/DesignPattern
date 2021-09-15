package org.designpattern.createpattern._2_abstractfactory;


import lombok.SneakyThrows;

public class ApplicationConfigFile {

    @SneakyThrows
    public static void main(String[] args) {
        GUIFactory guiFactory;

        if ("windows".equals(System.getProperty("os.name"))) {
            guiFactory = new WinFactory();
        } else if("Mac OS X".equals(System.getProperty("os.name"))){
            guiFactory = new MacFactory();
        } else {
            throw new Exception("未知的系统类型");
        }

        Application application = new Application(guiFactory);

        // 渲染
        application.createUI();
        // 渲染结果
        application.paint();
    }
}
