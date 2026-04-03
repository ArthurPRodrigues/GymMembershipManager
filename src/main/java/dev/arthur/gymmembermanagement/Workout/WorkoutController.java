package dev.arthur.gymmembermanagement.Workout;

import java.util.List;

import org.springframework.http.ResponseEntity;
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
	private final WorkoutService workoutService;

	public WorkoutController(WorkoutRepository workoutRepository, WorkoutService workoutService) {
		this.workoutRepository = workoutRepository;
		this.workoutService = workoutService;
	}

	@PostMapping("/create")
	public ResponseEntity<WorkoutDTO> createWorkout(@RequestBody WorkoutDTO workoutDTO) {
		WorkoutDTO createdWorkout = workoutService.createWorkout(workoutDTO);
		return ResponseEntity.ok(createdWorkout);
	}

	@GetMapping("/{id}")
	public ResponseEntity<WorkoutModel> getWorkoutById(@PathVariable Long id) {
		return workoutService.listWorkoutsById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/list")
	public ResponseEntity<List<WorkoutDTO>> listWorkouts() {
		List<WorkoutDTO> workouts = workoutService.listWorkouts();
		return ResponseEntity.ok(workouts);
	}

	@PutMapping("/{id}")
	public ResponseEntity<WorkoutDTO> updateWorkout(@PathVariable Long id, @RequestBody WorkoutDTO workoutDTO) {
		WorkoutDTO updated = workoutService.updateWorkout(id, workoutDTO);
		return ResponseEntity.ok(updated);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteWorkout(@PathVariable Long id) {
		if (workoutService.listWorkoutsById(id).isPresent()) {
			workoutService.deleteWorkout(id);
			return ResponseEntity.ok("Workout deleted successfully");
		}

		return ResponseEntity.notFound().build();
	}

}
