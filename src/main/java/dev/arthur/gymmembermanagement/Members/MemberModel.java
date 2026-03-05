package dev.arthur.gymmembermanagement.Members;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import dev.arthur.gymmembermanagement.Workout.WorkoutModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_members")
@NoArgsConstructor
@AllArgsConstructor
public class MemberModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "email")
	private String email;

	@Column(name = "membership_type")
	private String membershipType;

	@ManyToMany
	@JoinTable(
			name = "tb_members_workouts",
			joinColumns = @JoinColumn(name = "member_id"),
			inverseJoinColumns = @JoinColumn(name = "workout_id")
	)
	private List<WorkoutModel> workouts;
}
