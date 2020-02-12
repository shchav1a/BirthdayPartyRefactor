package scrap.heap.refactor.service.impl;

import scrap.heap.refactor.exceptions.OrderException;
import scrap.heap.refactor.model.Cake;
import scrap.heap.refactor.service.OrderService;

public class CakeOrderService implements OrderService<Cake> {

    @Override
    public void order(Cake item) throws OrderException {

        //for the purposes of this exercise, pretend that this method adds a cake to the order
        System.out.println("cake ordered; " + item.toString());
    }
}
