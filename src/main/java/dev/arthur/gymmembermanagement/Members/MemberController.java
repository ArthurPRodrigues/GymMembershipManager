package dev.arthur.gymmembermanagement.Members;

import dev.arthur.gymmembermanagement.Workout.WorkoutRepository;

public class MemberController {
	private final MemberRepository memberRepository;
	private final WorkoutRepository workoutRepository;

	public MemberController(
			MemberRepository memberRepository,
			WorkoutRepository workoutRepository) {
		this.memberRepository = memberRepository;
		this.workoutRepository = workoutRepository;
	}
}
