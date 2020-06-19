package guru.springframework.web.controller;

import guru.springframework.web.model.BeerDta;
import guru.springframework.web.services.BeerServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    public BeerServices beerServices;

    public BeerController(BeerServices beerServices) {
        this.beerServices = beerServices;
    }

    @GetMapping({"/beerId"})
    public ResponseEntity <BeerDta> getBeer(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerServices.getBeerById(beerId), HttpStatus.OK);
    }

}
