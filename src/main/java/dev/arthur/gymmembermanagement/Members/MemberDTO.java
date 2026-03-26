package dev.arthur.gymmembermanagement.Members;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import dev.arthur.gymmembermanagement.Workout.WorkoutModel;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {

	private long id;
	private String name;
	private String email;
	private String membershipType;
	private int age;
	private WorkoutModel workout;
	private List<WorkoutModel> workouts;
}
