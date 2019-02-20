package com.bofa.kyc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bofa.kyc.model.AppointmentsSQL;
import com.bofa.kyc.service.AppointmentServiceSQL;

@Controller
public class AppointmentController {

	@Autowired
	private AppointmentServiceSQL appointmentServiceSQL;

	@PostMapping("/addAppointment")
	public String addAppointment(@ModelAttribute AppointmentsSQL appointment) {
		appointmentServiceSQL.addAppointment(appointment);
		return "redirect:getAllAppointments";
	}

	@GetMapping("/getAllAppointments")
	public String getAllAppointments(Model model) {
		model.addAttribute("appointmentList",appointmentServiceSQL.getAllAppointments());
		return "appointment";
	}
}
