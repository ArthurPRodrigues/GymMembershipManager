package dev.arthur.gymmembermanagement.Workout;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class WorkoutService {

	private final WorkoutRepository workoutRepository;

	public WorkoutService(WorkoutRepository workoutRepository) {
		this.workoutRepository = workoutRepository;
	}

	public List<WorkoutModel> listWorkouts() {
		return this.workoutRepository.findAll();
	}

	public Optional<WorkoutModel> listWorkoutsById(Long id) {
		return this.workoutRepository.findById(id);
	}

}
