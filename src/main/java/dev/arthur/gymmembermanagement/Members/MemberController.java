package dev.arthur.gymmembermanagement.Members;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MemberController {

	@PostMapping("/create")
	public String createMember() {
		return "Created Member";
	}
	@PutMapping
	public String Update() {
		return "This is the update endpoint.";
	}

}
