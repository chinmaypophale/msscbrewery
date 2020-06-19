package guru.springframework.web.services;

import guru.springframework.web.model.BeerDta;

import java.util.UUID;

public interface BeerServices {

    BeerDta getBeerById(UUID beerId);
}
