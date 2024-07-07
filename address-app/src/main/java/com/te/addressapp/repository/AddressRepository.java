package com.te.addressapp.repository;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.te.addressapp.entity.Address;
import lombok.RequiredArgsConstructor;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class AddressRepository {

    private final DynamoDBMapper dynamoDBMapper;

    public String saveData(Address address) {
        dynamoDBMapper.save(address);
        return address.getAddressid();
    }
}
