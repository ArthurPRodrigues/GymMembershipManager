package dev.arthur.gymmembermanagement.Members;

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

}
