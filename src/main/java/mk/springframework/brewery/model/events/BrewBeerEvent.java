package mk.springframework.brewery.model.events;

import lombok.NoArgsConstructor;
import mk.springframework.brewery.model.BeerDto;

@NoArgsConstructor
public class BrewBeerEvent extends BeerEvent{
    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
