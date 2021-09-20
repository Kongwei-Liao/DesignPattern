package org.designpattern.structure.proxy;

import java.util.List;

// 之前直接与服务对象交互的 GUI 类不需要改变，前提是它仅通过接口与服务对
// 象交互。我们可以安全地传递一个代理对象来代替真实服务对象，因为它们都实
// 现了相同的接口。
public class TVManager {
    private ThirdPartyTVLib service;

    public TVManager(ThirdPartyTVLib service) {
        this.service = service;
    }

    void renderVideosPage(int id) {
        String info = service.getVideoInfo(id);
        // 渲染视频页面
    }

    void renderListPanel() {
        List<String> videos = service.listVideos();
        // 渲染视频缩略图
    }

    void reactOnUserInput(int id) {
        renderListPanel();
        renderVideosPage(id);
    }
}
