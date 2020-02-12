package scrap.heap.refactor.service.impl;

import scrap.heap.refactor.exceptions.OrderException;
import scrap.heap.refactor.model.Balloons;
import scrap.heap.refactor.service.OrderService;

public class BalloonsOrderService implements OrderService<Balloons> {

    @Override
    public void order(Balloons item) throws OrderException {

        //for the purposes of this exercise, pretend this method works and adds balloons to the order
        System.out.println("Balloons ordered; " + item.toString());
    }
}
