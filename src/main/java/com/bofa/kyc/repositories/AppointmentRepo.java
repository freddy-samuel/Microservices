package com.bofa.kyc.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bofa.kyc.model.Appointments;

public interface AppointmentRepo extends MongoRepository<Appointments, Integer> {

}
