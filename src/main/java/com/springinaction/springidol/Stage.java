package com.springinaction.springidol;

/**
 * Created by weixiao on 2019/2/21 16:23
 */
public class Stage {
    private Stage(){}

    private static class StageSingletonHolder {
        //延迟加载实例
        static Stage instance = new Stage();
    }
    public static Stage getInstance(){
        //返回实例
        return StageSingletonHolder.instance;
    }
}
