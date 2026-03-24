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
		return memberRepository.findAll();
	}

	public Optional<MemberModel> listMembersById(Long id) {
		return memberRepository.findById(id);
	}
}
