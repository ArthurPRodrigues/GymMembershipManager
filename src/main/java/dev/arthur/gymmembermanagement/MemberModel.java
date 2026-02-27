package dev.arthur.gymmembermanagement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "members")
public class MemberModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	int age;
	String email;
	String membershipType;

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
