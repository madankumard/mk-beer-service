package mk.springframework.mkbeerservice.events;

import lombok.NoArgsConstructor;
import mk.springframework.mkbeerservice.web.model.BeerDto;

@NoArgsConstructor
public class BrewBeerEvent extends BeerEvent{
    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
