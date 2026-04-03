package dev.arthur.gymmembermanagement.Workout;

import org.springframework.stereotype.Component;

@Component
public class WorkoutMapper {

	// 1. DTO -> Model (Used for POST/PUT to save in the database)
	public WorkoutModel map(WorkoutDTO workoutDTO) {
		WorkoutModel workoutModel = new WorkoutModel();
		workoutModel.setTitle(workoutDTO.getTitle());
		workoutModel.setMusclegroup(workoutDTO.getMuscleGroup());
		workoutModel.setDifficulty(workoutDTO.getDifficulty());
		workoutModel.setDuration(workoutDTO.getDuration());
		workoutModel.setMembers(workoutDTO.getMembers());

		return workoutModel;
	}

	// 2. Model -> DTO (Used for GET to send data to the user)
	public WorkoutDTO map(WorkoutModel workoutModel) {
		WorkoutDTO workoutDTO = new WorkoutDTO();
		workoutDTO.setTitle(workoutModel.getTitle());
		workoutDTO.setMuscleGroup(workoutModel.getMusclegroup());
		workoutDTO.setDifficulty(workoutModel.getDifficulty());
		workoutDTO.setDuration(workoutModel.getDuration());
		workoutDTO.setMembers(workoutModel.getMembers());

		return workoutDTO;
	}
}
