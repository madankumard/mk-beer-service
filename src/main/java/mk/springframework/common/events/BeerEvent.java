package mk.springframework.common.events;

import lombok.*;
import mk.springframework.mkbeerservice.web.model.BeerDto;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -9106931763885233075L;

    private BeerDto beerDto;
}
