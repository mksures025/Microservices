package com.te.addressapp.service;

import com.te.addressapp.dto.AddressDTO;
import com.te.addressapp.entity.Address;
import com.te.addressapp.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final ModelMapper modelMapper;

    @Override
    public String insertAddressData(AddressDTO addressDTO) {

        Address address = modelMapper.map(addressDTO, Address.class);

      String addressId = addressRepository.saveData(address);

        return addressId;
    }
}
