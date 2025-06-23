package com.zainmorshed.jobtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// import the JobApplication class from the correct package
import com.zainmorshed.jobtracker.model.JobApplication;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {

	
}
