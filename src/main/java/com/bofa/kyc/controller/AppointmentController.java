package com.bofa.kyc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bofa.kyc.model.Appointments;
import com.bofa.kyc.service.AppointmentService;

@RestController
public class AppointmentController {

	private AppointmentService appointmentService;
	
	@PostMapping("/addAppointment")
	public @ResponseBody Appointments addAppointment(@RequestBody Appointments appointment) {
		return appointmentService.addAppointment(appointment);
	}
	
	@GetMapping("/getAllAppointments")
	public List<Appointments> getAllAppointments(){
		return appointmentService.getAllAppointments();
	}
}
