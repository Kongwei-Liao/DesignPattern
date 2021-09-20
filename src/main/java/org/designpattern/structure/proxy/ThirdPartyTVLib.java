package org.designpattern.structure.proxy;

import java.util.List;

// 远程服务接口。
public interface ThirdPartyTVLib {
    List<String> listVideos();
    String getVideoInfo(int id);
    void downloadVideo(int id);
}
