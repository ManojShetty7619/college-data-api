package com.app.college.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.college.dao.CollegeRepository;
import com.app.college.model.College;

@Service
public class CollegeService {
	@Autowired
	private CollegeRepository collegerepository;

	public College createCollege(College college) {
		return collegerepository.save(college);
	}

	public List<College> createDiffCollege(List<College> colleges) {

		return collegerepository.saveAll(colleges);
	}

	public List<College> getAllCollege() {

		return collegerepository.findAll();
	}

	public College getCollegeById(int collegeId) {

		return collegerepository.findById(collegeId).orElse(null);
	}

}
