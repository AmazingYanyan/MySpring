package org.yanyan;

public class OrderService {
    public void submitOrder(Sender sender, String msg){
        sender.sendMsg(msg);
    }
}
