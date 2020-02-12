package scrap.heap.refactor.model;


import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;

@Builder
@ToString
public class Balloons implements OrderItem {

    @NonNull
    private Color balloonColor;
    @NonNull
    private Material material;
    @NonNull
    private Integer number;


}
