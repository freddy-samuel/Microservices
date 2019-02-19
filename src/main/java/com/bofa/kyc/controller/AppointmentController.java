package com.bofa.kyc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bofa.kyc.configurations.DbConfiguration;
import com.bofa.kyc.model.Appointments;
import com.google.gson.Gson;

@RestController
public class AppointmentController {

	@Autowired
	private DbConfiguration dbconfig;

	@PostMapping("/addAppointment")
	public @ResponseBody Appointments addAppointment(@RequestBody String appointment) {
		Gson gson = new Gson();
		return dbconfig.getNoSqlInstance().addAppointment(gson.fromJson(appointment, Appointments.class));
	}

	@GetMapping("/getAllAppointments")
	public List<Appointments> getAllAppointments() {
		return dbconfig.getNoSqlInstance().getAllAppointments();
	}
}
