package mk.springframework.mkbeerservice.web.mappers;

import mk.springframework.mkbeerservice.domain.Beer;
import mk.springframework.mkbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto dto);
}
