package mk.springframework.common.events;

import lombok.NoArgsConstructor;
import mk.springframework.mkbeerservice.web.model.BeerDto;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent{
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
