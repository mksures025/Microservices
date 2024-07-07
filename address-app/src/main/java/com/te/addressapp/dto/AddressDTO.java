package com.te.addressapp.dto;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class AddressDTO {

    private String city;

    private String state;
}
