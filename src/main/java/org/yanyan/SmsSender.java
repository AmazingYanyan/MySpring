package org.yanyan;

public class SmsSender implements Sender {
    @Override
    public void sendMsg(String msg) {
        System.out.println("这是sms发送的短信"+msg);
    }
}
