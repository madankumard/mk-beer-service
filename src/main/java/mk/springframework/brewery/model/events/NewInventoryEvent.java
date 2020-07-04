package mk.springframework.brewery.model.events;

import lombok.NoArgsConstructor;
import mk.springframework.brewery.model.BeerDto;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent{
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
