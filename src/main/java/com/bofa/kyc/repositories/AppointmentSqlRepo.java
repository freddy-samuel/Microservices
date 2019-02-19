package com.bofa.kyc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bofa.kyc.model.Appointments;
import com.bofa.kyc.model.AppointmentsSQL;

public interface AppointmentSqlRepo extends JpaRepository<AppointmentsSQL, Integer> {

}
