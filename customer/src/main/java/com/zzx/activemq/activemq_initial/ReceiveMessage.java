package com.zzx.activemq.activemq_initial;

/**
 * Created by Mr.John on 2018/10/18 16:31.
 **/
public class ReceiveMessage {
    //模拟生成消息然后交给PTPSend发送
    String messageName="zht";
    String session="sessionId:321654987";
    //接收消息后处理
    public String get(String o){
        System.out.println(o+"收到！收到！信息收到！");
        return o;
    }
}
