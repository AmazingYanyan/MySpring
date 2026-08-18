package org.yanyan;

public class Main {
    public static void main(String[] args) {
        OrderServer orderServer = new OrderServer();
        orderServer.submitOrder("email");
        orderServer.submitOrder("sms");
    }
}