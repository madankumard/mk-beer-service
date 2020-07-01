package mk.springframework.mkbeerservice.web.mappers;

import mk.springframework.mkbeerservice.domain.Beer;
import mk.springframework.mkbeerservice.web.model.BeerDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);
}
