package com.bofa.kyc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bofa.kyc.model.AppointmentsSQL;

public interface AppointmentSqlRepo extends JpaRepository<AppointmentsSQL, Integer> {

}
