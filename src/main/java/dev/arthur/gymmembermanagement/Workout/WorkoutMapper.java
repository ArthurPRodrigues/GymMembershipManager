package dev.arthur.gymmembermanagement.Workout;

public class WorkoutMapper {

	public WorkoutModel map(WorkoutDTO workoutDTO) {
		WorkoutModel workoutModel = new WorkoutModel();
		workoutModel.setTitle(workoutDTO.getTitle());
		workoutModel.setMusclegroup(workoutDTO.getMuscleGroup());
		workoutModel.setDifficulty(workoutDTO.getDifficulty());
		workoutModel.setDuration(workoutDTO.getDuration());
		workoutModel.setMembers(workoutDTO.getMember());

		return workoutModel;
	}

}
