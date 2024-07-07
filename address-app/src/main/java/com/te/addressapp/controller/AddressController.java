package com.te.addressapp.controller;


import com.te.addressapp.dto.AddressDTO;
import com.te.addressapp.response.AddressResponse;
import com.te.addressapp.service.AddressService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "address")
public class AddressController {

    private final AddressService addressService;

    @PostMapping(path = "/insertaddress")
    public ResponseEntity<AddressResponse> addressResponse(@RequestBody AddressDTO addressDTO){

        String addressId = addressService.insertAddressData(addressDTO);

        return ResponseEntity.ok().body(AddressResponse.builder()
                .data(addressId).build());
    }


}
