package com.zzx.activemq.activemq_initial;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by Mr.John on 2018/10/18 16:43.
 **/
public class MyMessageListener implements MessageListener {

    ReceiveMessage receiveMessage=new ReceiveMessage();
    @Override
    public void onMessage(Message message) {
        try {
            //获取到接收的数据
            String text = ((TextMessage)message).getText();
            //收到消息后做一些事情比如打印嘛！
            receiveMessage.get(text);
          //  System.out.println(text);
            message.acknowledge();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
