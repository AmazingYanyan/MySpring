package org.yanyan;

public class OrderServer {
    public void submitOrder(String tool){
        if("email".equals(tool)){
            SmsSender smsSender = new SmsSender();
            smsSender.sendmsg("订单1号");
        } else if ("sms".equals(tool)) {
            EmailSender emailSender = new EmailSender();
            emailSender.sendmsg("订单2号");
        }

    }
}
