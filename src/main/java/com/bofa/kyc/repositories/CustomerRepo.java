package com.bofa.kyc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bofa.kyc.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	@Modifying(clearAutomatically = true)
	@Query("from Customer where firstName=:firstName")
	List<Customer> findByName(@Param("firstName") String firstName);

}
