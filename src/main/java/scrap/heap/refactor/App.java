package scrap.heap.refactor;

import scrap.heap.refactor.controller.OrderManager;
import scrap.heap.refactor.model.*;

public class App {
    public static void main(String[] args) {

        final OrderManager manager = new OrderManager();

        //Place birthday party orders
        //order("red", "mylar", "4", "chocolate", "chocolate", "circle", "large", "brown" );
        Balloons balloonsOrder1 = Balloons.builder()
                .balloonColor(Color.RED).material(Material.MYLAR).number(4).build();
        Cake cakeOrder1 = Cake.builder()
                .flavor(Flavor.CHOCOLATE).frostingFlavor(Flavor.CHOCOLATE).shape(Shape.CIRCLE).size(Size.LARGE).cakeColor(Color.BROWN).build();
        Order order1 = Order.builder().cake(cakeOrder1).balloons(balloonsOrder1).build();
        manager.create(order1);

        //order("blue", "latex", "7", "Vanilla", "chocelate", "square", "med", "brown" );
        Balloons balloonsOrder2 = Balloons.builder()
                .balloonColor(Color.BLUE).material(Material.LATEX).number(7).build();
        Cake cakeOrder2 = Cake.builder()
                .flavor(Flavor.VANILLA).frostingFlavor(Flavor.CHOCOLATE).shape(Shape.SQUARE).size(Size.MED).cakeColor(Color.BROWN).build();
        Order order2 = Order.builder().cake(cakeOrder2).balloons(balloonsOrder2).build();
        manager.create(order2);

        //order("yellow", "mylar", "4", "vanilla", "vanilla", "square", "small", "yellow" );
        Balloons balloonsOrder3 = Balloons.builder()
                .balloonColor(Color.YELLOW).material(Material.MYLAR).number(4).build();
        Cake cakeOrder3 = Cake.builder()
                .flavor(Flavor.VANILLA).frostingFlavor(Flavor.VANILLA).shape(Shape.SQUARE).size(Size.SMALL).cakeColor(Color.YELLOW).build();
        Order order3 = Order.builder().cake(cakeOrder3).balloons(balloonsOrder3).build();
        manager.create(order3);

    }

    public String getGreeting() {
        return "Hello world.";
    }

}
