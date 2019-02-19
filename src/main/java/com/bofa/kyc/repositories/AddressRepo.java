package com.bofa.kyc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bofa.kyc.model.Address;
import com.bofa.kyc.model.Customer;

public interface AddressRepo extends JpaRepository<Address, Integer> {

	@Modifying(clearAutomatically = true)
	@Query("from Address where state=:state")
	List<Customer> findByState(@Param("state") String state);
}
