package dev.arthur.gymmembermanagement.Members;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

	private final MemberRepository memberRepository;
	private final MemberMapper memberMapper;

	public MemberService(MemberRepository memberRepository, MemberMapper memberMapper) {
		this.memberRepository = memberRepository;
		this.memberMapper = memberMapper;
	}

	public List<MemberModel> listMembers() {
		return memberRepository.findAll();
	}

	public Optional<MemberModel> listMembersById(Long id) {
		return memberRepository.findById(id);
	}

	public MemberDTO createMember(MemberDTO memberDTO) {
		MemberModel memberModel = memberMapper.map(memberDTO);
		memberRepository.save(memberModel);
		return memberDTO;
	}

	public MemberDTO updateMember(Long id, MemberDTO memberDTO) {
		MemberModel memberModel = memberMapper.map(memberDTO);
		memberModel.setId(id);
		memberRepository.save(memberModel);
		return memberDTO;
	}

	public void deleteMember(Long id) {
		memberRepository.deleteById(id);
	}
}
