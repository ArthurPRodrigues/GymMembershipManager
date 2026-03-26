package dev.arthur.gymmembermanagement.Workout;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import dev.arthur.gymmembermanagement.Members.MemberModel;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkoutDTO {

	private String title;
	private String muscleGroup;
	private long difficulty;
	private int duration;
	private List<MemberModel> members;

	public List<MemberModel> getMember() {
		return members;
	}
}
