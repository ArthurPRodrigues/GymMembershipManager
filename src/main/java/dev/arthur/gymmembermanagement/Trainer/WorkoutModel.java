package dev.arthur.gymmembermanagement.Trainer;

import java.util.List;

import dev.arthur.gymmembermanagement.Members.MemberModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_workouts")
public class WorkoutModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String musclegroup;
	private long difficulty;
	private int duration;

	// one workout can be associated with many members, and one member can have many workouts
	@ManyToMany()
	@JoinColumn(name = "member_id")
	private List<MemberModel> members;

	public WorkoutModel(int age, String email, String membershipType, long difficulty, int duration) {
		this.title = title;
		this.musclegroup = musclegroup;
		this.difficulty = difficulty;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public String getMusclegroup() {
		return musclegroup;
	}

	public long getDifficulty() {
		return difficulty;
	}

	public int getDuration() {
		return duration;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setMusclegroup(String musclegroup) {
		this.musclegroup = musclegroup;
	}

	public void setDifficulty(long difficulty) {
		this.difficulty = difficulty;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
