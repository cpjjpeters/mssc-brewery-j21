package guru.springframework.mssc_brewery.services;

import guru.springframework.mssc_brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId );
    BeerDto saveNewBeer(BeerDto beerDto);
}
