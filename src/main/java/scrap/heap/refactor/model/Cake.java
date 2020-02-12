package scrap.heap.refactor.model;

import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;

@Builder
@ToString
public class Cake implements OrderItem {

    @NonNull
    private Flavor frostingFlavor;
    @NonNull
    private Flavor flavor;
    @NonNull
    private Shape shape;
    @NonNull
    private Size size;
    @NonNull
    private Color cakeColor;

}
