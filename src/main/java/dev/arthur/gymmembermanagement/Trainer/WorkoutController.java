package dev.arthur.gymmembermanagement.Trainer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WorkoutController {

	@GetMapping("/welcome")
	public String Welcome() {
		return "Welcome to the Gym Trainer!";}

	@PutMapping
	public String Update() {
		return "Update trainer information endpoint.";
	}

}
