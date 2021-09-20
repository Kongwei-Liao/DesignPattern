package org.designpattern.structure.proxy;

import java.util.List;

// 服务连接器的具体实现。该类的方法可以向腾讯视频请求信息。请求速度取决于
// 用户和腾讯视频的互联网连接情况。如果同时发送大量请求，即使所请求的信息
// 一模一样，程序的速度依然会减慢。
public class ThirdPartyTVClass implements ThirdPartyTVLib {

    @Override
    public List<String> listVideos() {
        System.out.println("向腾讯视频发送一个API请求");
        return null;
    }

    @Override
    public String getVideoInfo(int id) {
        System.out.println("获取某一视频元数据");
        return null;
    }

    @Override
    public void downloadVideo(int id) {
        System.out.println("从腾讯视频下载一个视频文件");
    }
}
