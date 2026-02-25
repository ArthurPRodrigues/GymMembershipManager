package dev.arthur.GymMemberManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

	@GetMapping("/welcome")
	public String Welcome() {
		return "Welcome to the Gym Member Management System!";
	}

	@PutMapping
	public String Update() {
		return "This is the update endpoint.";
	}

}
