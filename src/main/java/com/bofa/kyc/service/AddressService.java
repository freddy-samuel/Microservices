package com.bofa.kyc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bofa.kyc.model.Address;
import com.bofa.kyc.model.Customer;
import com.bofa.kyc.repositories.AddressRepo;
import com.bofa.kyc.repositories.CustomerRepo;

@Service
public class AddressService {

	@Autowired
	private AddressRepo addressRepo;
	
	@Autowired
	private CustomerRepo customerRepo;

	public Address insert(Address address, int id) {
		Customer customer = customerRepo.findById(id).orElse(null);
		System.out.println(customer.getCustomerId());
		address.setCustomer(customer);
		return addressRepo.save(address);
	}

	public Address findById(int id) {
		// TODO Auto-generated method stub
		return addressRepo.findById(id).orElse(null);
	}
}
