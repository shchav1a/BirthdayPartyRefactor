package scrap.heap.refactor.controller;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import scrap.heap.refactor.exceptions.OrderException;
import scrap.heap.refactor.model.Balloons;
import scrap.heap.refactor.model.Cake;
import scrap.heap.refactor.model.Order;
import scrap.heap.refactor.service.impl.BalloonsOrderService;
import scrap.heap.refactor.service.impl.CakeOrderService;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class OrderManagerTest {
    @InjectMocks
    private OrderManager manager;

    @Mock
    private BalloonsOrderService balloonsOrderService;

    @Mock
    private CakeOrderService cakeOrderService;

    private OrderException ex = new OrderException("No Cakes");

    private Order order;
    private Balloons balloons;
    private Cake cake;

    @Before
    public void init() {
        order = Mockito.mock(Order.class);
    }

    @Test
    public void create_validOrder() throws Exception {
        manager.create(order);
        Mockito.verify(cakeOrderService, times(1)).order(any(Cake.class));
        Mockito.verify(balloonsOrderService, times(1)).order(any(Balloons.class));
    }


    @Test(expected = OrderException.class)
    public void create_orderException() throws Exception {
        Mockito.doThrow(OrderException.class).when(cakeOrderService).order(any(Cake.class));

        manager.create(order);
    }
}
