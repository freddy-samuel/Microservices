package com.bofa.kyc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bofa.kyc.model.Appointments;
import com.bofa.kyc.repositories.AppointmentRepo;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepo appointmentRepo;
	
	public Appointments addAppointment(Appointments appointments){
		return appointmentRepo.save(appointments);
	}
	
	public List<Appointments> getAllAppointments(){
		return appointmentRepo.findAll();
	}
}
