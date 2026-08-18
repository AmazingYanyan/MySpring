package org.yanyan;

public class Main {
    public static void main(String[] args) {
        OrderService  orderService = new OrderService();
        orderService.submitOrder(new SmsSender(), "订单1号");
        orderService.submitOrder(new EmailSender(), "订单2号");
    }
}