package dev.arthur.gymmembermanagement.Workout;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {
	private final WorkoutRepository workoutRepository;

	public WorkoutController(WorkoutRepository workoutRepository) {
		this.workoutRepository = workoutRepository;
	}

	//Add a workout
	@PostMapping("/create")
	public WorkoutModel createWorkout(@RequestBody WorkoutModel workoutModel) {
		return workoutRepository.save(workoutModel);
	}

	// Find a workout by id
	@GetMapping("/{id}")
	public WorkoutModel workoutById(@PathVariable Long id) {
		return workoutRepository.findById(id).orElse(null);
	}

	// Show all workouts
	@GetMapping("/list")
	public List<WorkoutModel> allWorkouts() {
		return workoutRepository.findAll();
	}

	// Change data from workout
	@PutMapping("/{id}")
	public WorkoutModel updateWorkout(@RequestBody WorkoutModel workoutModel) {
		return workoutRepository.save(workoutModel);
	}

	// Delete workout
	@DeleteMapping("/{id}")
	public String deleteWorkoutsById() {
		return "Deleted workouts";
	}

}
