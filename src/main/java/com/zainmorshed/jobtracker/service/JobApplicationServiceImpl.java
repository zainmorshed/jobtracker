package com.zainmorshed.jobtracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// Update the import below to the correct package for JobApplication
import com.zainmorshed.jobtracker.model.JobApplication;
import java.util.List;

// Update the import below to the correct package for JobApplicationRepository
import com.zainmorshed.jobtracker.repository.JobApplicationRepository;

@Service
public class JobApplicationServiceImpl implements JobApplicationService {
	
	private final JobApplicationRepository jobRepository;

    @Autowired
    public JobApplicationServiceImpl(JobApplicationRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public JobApplication saveJob(JobApplication job){
        return jobRepository.save(job);
    }

    @Override
    public List<JobApplication> getAllJobs(){
        return jobRepository.findAll();
    }

    @Override
    public JobApplication getJobById(Long id){
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteJob(Long id) {
        jobRepository.findById(id).ifPresent(job -> jobRepository.delete(job));
    }
}
