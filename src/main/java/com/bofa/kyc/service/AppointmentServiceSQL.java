package com.bofa.kyc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bofa.kyc.model.AppointmentsSQL;
import com.bofa.kyc.repositories.AppointmentSqlRepo;

@Service
public class AppointmentServiceSQL {

	@Autowired
	private AppointmentSqlRepo appointmentSqlRepo;

	public AppointmentsSQL addAppointment(AppointmentsSQL appointments) {
		return appointmentSqlRepo.save(appointments);
	}

	public List<AppointmentsSQL> getAllAppointments() {
		return appointmentSqlRepo.findAll();
	}
}
