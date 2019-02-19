package com.bofa.kyc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bofa.kyc.model.Address;
import com.bofa.kyc.model.Customer;
import com.bofa.kyc.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/addcustomer")
	public @ResponseBody Customer insertCustomer(@RequestBody Customer customer) {
		Address address=new Address();
		address.setAddressLineOne("test address");
		List<Address> addressList=new ArrayList<Address>();
		addressList.add(address);
		customer.setAddress(addressList);
		return customerService.addCustomer(customer);
	}

	@GetMapping("/getallcustomers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@GetMapping("/getcustomerbyid/{id}")
	public Customer customerById(@PathVariable("id") int id) {
		return customerService.getCustomerById(id);
	}
	
	@GetMapping("/getcustomerbyName/{firstName}")
	public List<Customer> customerById(@PathVariable("firstName") String firstName) {
		return customerService.getCustomerByFirstName(firstName);
	}

	@PutMapping("/updateCustomer/{id}")
	public Customer updateCustomer(@PathVariable("id") int id) {
		Customer customer = customerService.getCustomerById(id);
		customer.setFirstName("firstName updated");
		return customerService.updateCustomer(customer);
	}
}
