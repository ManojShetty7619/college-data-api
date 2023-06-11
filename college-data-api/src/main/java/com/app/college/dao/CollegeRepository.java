package com.app.college.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.college.model.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {

}
