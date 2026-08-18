package org.yanyan;

public class EmailSender implements Sender {
    @Override
    public void sendMsg(String msg) {
        System.out.println("这是email发送的短信"+msg);
    }
}

