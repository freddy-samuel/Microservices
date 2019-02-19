package com.bofa.kyc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bofa.kyc.model.Customer;
import com.bofa.kyc.repositories.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	public Customer addCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

	public Customer getCustomerById(int id) {
		return customerRepo.findById(id).orElse(null);
	}
	
	public List<Customer> getCustomerByFirstName(String firstName) {
		return customerRepo.findByName(firstName);
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

}
