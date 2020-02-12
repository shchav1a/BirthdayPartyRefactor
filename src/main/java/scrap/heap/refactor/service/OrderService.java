package scrap.heap.refactor.service;

import scrap.heap.refactor.exceptions.OrderException;
import scrap.heap.refactor.model.OrderItem;

public interface OrderService<T extends OrderItem> {

    void order(T item) throws OrderException;
}
