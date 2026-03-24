package dev.arthur.gymmembermanagement.Workout;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {

	//Add a workout
	@PostMapping("/create")
	public String createNinja() {
		return "Created Ninja";
	}

	// Find a workout by id
	@GetMapping("/allId")
	public String allWorkoutsById() {
		return "All Workouts";
	}

	// Show all workouts
	@GetMapping("/all")
	public String allWorkouts() {
		return "All workouts";
	}

	// Change data from workout
	@PutMapping("/update")
	public String updateWorkoutsById() {
		return "Updated workouts";
	}

	// Delete workout
	@DeleteMapping("/deleteId")
	public String deleteWorkoutsById() {
		return "Deleted workouts";
	}

}
