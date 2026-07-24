package dev.arthur.gymmembermanagement.Members;

import org.springframework.stereotype.Component;

@Component
public class MemberMapper {

	public MemberModel map(MemberDTO memberDTO) {
		MemberModel memberModel = new MemberModel();
		memberModel.setId(memberDTO.getId());
		memberModel.setName(memberDTO.getName());
		memberModel.setAge(memberDTO.getAge());
		memberModel.setEmail(memberDTO.getEmail());
		memberModel.setMembershipType(memberDTO.getMembershipType());
		memberModel.setWorkouts(memberDTO.getWorkouts());

		return memberModel;
	}

	public MemberDTO map(MemberModel memberModel) {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(memberModel.getId());
		memberDTO.setName(memberModel.getName());
		memberDTO.setAge(memberModel.getAge());
		memberDTO.setEmail(memberModel.getEmail());
		memberDTO.setMembershipType(memberModel.getMembershipType());
		memberDTO.setWorkouts(memberModel.getWorkouts());

		return memberDTO;
	}

}
