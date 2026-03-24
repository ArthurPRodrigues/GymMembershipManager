package dev.arthur.gymmembermanagement.Members;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberController {

	private final MemberService memberService;

	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	//Add a member
	@PostMapping("/create")
	public String createMember () {
		return "Created Member";
	}

	// Find a member by Id
	@GetMapping("/{id}")
	public Optional<MemberModel> membersById(@PathVariable Long id) {
		return this.memberService.listMembersById(id);
	}

	@GetMapping("/list")
	public List<MemberModel> listMembers() {
		return memberService.listMembers();
	}

	@PutMapping("/update")
	public String updateMember() {
		return "Updated Member";
	}

	@DeleteMapping("/deleteId")
	public String deleteMember() {
		return "Deleted Member";
	}

}
