package scrap.heap.refactor.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Order {

    //TODO: to tag @NonNull required fields
    private Cake cake;
    private Balloons balloons;
}
