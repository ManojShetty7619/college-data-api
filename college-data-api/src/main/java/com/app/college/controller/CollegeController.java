package com.app.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.college.model.College;
import com.app.college.service.CollegeService;

@RestController
public class CollegeController {
	@Autowired
	private CollegeService collegeService;

	@PostMapping("/addCollege")
	public College addCollege(@RequestBody College college) {
		return collegeService.createCollege(college);
	}

	@PostMapping("/addDiffCollege")
	public List<College> addUsers(@RequestBody List<College> colleges) {
		return collegeService.createDiffCollege(colleges);

	}

	@GetMapping("/allCollege")
	public List<College> getAllCollege() {
		return collegeService.getAllCollege();
	}

	@GetMapping("/college/{collegeId}")
	public College getUserById(@PathVariable int collegeId) {
		return collegeService.getCollegeById(collegeId);

	}
}
