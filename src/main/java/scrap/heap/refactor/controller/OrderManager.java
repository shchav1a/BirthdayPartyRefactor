package scrap.heap.refactor.controller;

import scrap.heap.refactor.exceptions.OrderException;
import scrap.heap.refactor.model.Balloons;
import scrap.heap.refactor.model.Cake;
import scrap.heap.refactor.model.Order;
import scrap.heap.refactor.service.OrderService;
import scrap.heap.refactor.service.impl.BalloonsOrderService;
import scrap.heap.refactor.service.impl.CakeOrderService;


public class OrderManager {

    private OrderService<Balloons> balloonsOrderService = new BalloonsOrderService();
    private OrderService<Cake> cakeOrderService = new CakeOrderService();

    public void create(Order order) {
        try {
            balloonsOrderService.order(order.getBalloons());
            cakeOrderService.order(order.getCake());

        } catch (OrderException e) {

            //TODO: Add OrderException Handling
            e.printStackTrace();
            throw new OrderException("OrderManager trace", e);

        }
    }
}

