package dev.arthur.gymmembermanagement.Members;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

	private final MemberRepository memberRepository;

	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	public List<MemberModel> listMembers() {
		Optional<MemberModel> listMemberById = memberRepository.findAll().stream().findFirst();
		return memberRepository.findAll();
	}

	public Optional<MemberModel> listMembersById(Long id) {
		Optional<MemberModel> listMemberById = memberRepository.findById(id);
		return Optional.ofNullable(listMemberById.orElse(null));
	}

	public MemberModel createMember(MemberModel memberModel) {
		return memberRepository.save(memberModel);
	}

	public void deleteMember(long id) {
		memberRepository.deleteById(id);
	}
}
