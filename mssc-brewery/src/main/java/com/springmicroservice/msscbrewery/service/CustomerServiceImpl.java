package com.springmicroservice.msscbrewery.service;

import com.springmicroservice.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("James Bond II")
                .build();
    }

    @Override
    public CustomerDto addNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.info("Customer updated with name : "+customerDto.getName());
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.info("Customer deleted...");
    }
}
