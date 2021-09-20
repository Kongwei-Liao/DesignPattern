package org.designpattern.structure.proxy;

public class Application {
    public void init() {
        ThirdPartyTVLib libService = new ThirdPartyTVClass();
        ThirdPartyTVLib libProxy = new CachedTVClass(libService);
        TVManager tvManager = new TVManager(libProxy);
        tvManager.reactOnUserInput(1);
    }
}
