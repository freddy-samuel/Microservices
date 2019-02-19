package com.bofa.kyc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bofa.kyc.model.Address;
import com.bofa.kyc.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@GetMapping("/getaddressforcustomer/{id}")
	public Address getAddressForCustomer(@PathVariable("id") int id) {
		return addressService.findById(id);
	}
	
	@GetMapping("/saveaddressforcustomer/{id}")
	public Address getAddressForCustomer(@RequestBody Address address,@PathVariable("id") int id) {
		return addressService.insert(address,id);
	}
}
