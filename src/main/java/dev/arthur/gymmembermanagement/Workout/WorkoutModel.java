package dev.arthur.gymmembermanagement.Workout;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import dev.arthur.gymmembermanagement.Members.MemberModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_workouts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "musclegroup")
	private String musclegroup;

	@Column(name = "difficulty")
	private long difficulty;

	@Column(name = "duration")
	private int duration;

	// one workout can be associated with many members, and one member can have many workouts
	@ManyToMany(mappedBy = "workouts")
	private List<MemberModel> members;

}
