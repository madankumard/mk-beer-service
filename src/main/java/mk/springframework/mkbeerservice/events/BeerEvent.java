package mk.springframework.mkbeerservice.events;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import mk.springframework.mkbeerservice.web.model.BeerDto;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -9106931763885233075L;

    private final BeerDto beerDto;
}
