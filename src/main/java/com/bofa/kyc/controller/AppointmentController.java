package com.bofa.kyc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bofa.kyc.configurations.DbConfiguration;
import com.bofa.kyc.model.AppointmentsSQL;
import com.google.gson.Gson;

@Controller
public class AppointmentController {

	@Autowired
	private DbConfiguration dbconfig;

	@PostMapping("/addAppointment")
	public String addAppointment(@ModelAttribute AppointmentsSQL appointment) {
		dbconfig.getNoSqlInstance().addAppointment(appointment);
		return "redirect:getAllAppointments";
	}

	@GetMapping("/getAllAppointments")
	public String getAllAppointments(Model model) {
		model.addAttribute("appointmentList",dbconfig.getNoSqlInstance().getAllAppointments());
		return "appointment";
	}
}
