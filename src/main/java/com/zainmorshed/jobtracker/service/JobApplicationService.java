package com.zainmorshed.jobtracker.service;

// TODO: Replace 'com.zainmorshed.jobtracker.model' with the actual package name where JobApplication is defined
import com.zainmorshed.jobtracker.model.JobApplication;
import java.util.List;


public interface JobApplicationService {
    JobApplication saveJob(JobApplication job);
    List<JobApplication> getAllJobs();
    JobApplication getJobById(Long id);
    void deleteJob(Long id);

} 
    

