package dev.arthur.gymmembermanagement.Members;

import java.util.List;

import dev.arthur.gymmembermanagement.Trainer.WorkoutModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_members")
public class MemberModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int age;
	private String email;
	private String membershipType;

	@ManyToMany()
	private List<WorkoutModel> workouts;

	public MemberModel() {
	}

	public MemberModel(String name, int age, String email, String membershipType) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.membershipType = membershipType;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}
}
