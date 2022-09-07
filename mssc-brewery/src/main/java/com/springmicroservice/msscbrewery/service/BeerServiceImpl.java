package com.springmicroservice.msscbrewery.service;

import com.springmicroservice.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Budweiser Magnum")
                .beerStyle("Strong")
                .upc(12L)
                .build();

    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        System.out.println("Beer id to be updated "+beerId);
        System.out.println(String.format("Beer %s is going to be updated...", beerDto.getBeerName()));
    }

    @Override
    public void deleteById(UUID beerId) {
//        System.out.println("In delete");
        log.info("Deleted beer with Id:- "+beerId);
    }
}
