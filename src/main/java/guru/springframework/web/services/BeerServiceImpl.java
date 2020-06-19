package guru.springframework.web.services;

import guru.springframework.web.model.BeerDta;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerServices{
    @Override
    public BeerDta getBeerById(UUID beerId) {

        return BeerDta.builder().id(UUID.randomUUID())
                .beerName("Beer Name")
                .beerStyle("Beer Style")
                .build();
    }
}
