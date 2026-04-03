package dev.arthur.gymmembermanagement.Workout;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WorkoutService {

	private final WorkoutRepository workoutRepository;
	private final WorkoutMapper workoutMapper;

	public WorkoutService(WorkoutRepository workoutRepository, WorkoutMapper workoutMapper) {
		this.workoutRepository = workoutRepository;
		this.workoutMapper = workoutMapper;
	}

	public List<WorkoutDTO> listWorkouts() {
		List<WorkoutModel> workouts = workoutRepository.findAll();

		return workouts.stream()
				.map(workout -> workoutMapper.map(workout))
				.toList();
	}

	public Optional<WorkoutModel> listWorkoutsById(Long id) {
		return workoutRepository.findById(id);
	}

	public WorkoutDTO createWorkout(WorkoutDTO workoutDTO) {
		WorkoutModel workout = workoutMapper.map(workoutDTO);
		workoutRepository.save(workout);
		return workoutDTO;
	}

	public void deleteWorkout(Long id) {
		workoutRepository.deleteById(id);
	}

	public WorkoutDTO updateWorkout(Long id, WorkoutDTO workoutDTO) {
		WorkoutModel workout = workoutRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Workout not found"));
		workout.setTitle(workoutDTO.getTitle());
		workout.setMusclegroup(workoutDTO.getMuscleGroup());
		workout.setDifficulty(workoutDTO.getDifficulty());
		workout.setDuration(workoutDTO.getDuration());
		workout.setMembers(workoutDTO.getMembers());

		workoutRepository.save(workout);

		return workoutDTO;
	}
}
