package com.zainmorshed.jobtracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zainmorshed.jobtracker.model.JobApplication;
import com.zainmorshed.jobtracker.service.JobApplicationService;
import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobApplicationController {

    private final JobApplicationService jobApplicationService;

    @Autowired
    public JobApplicationController(JobApplicationService jobApplicationService) {
        this.jobApplicationService = jobApplicationService;
    }

    @GetMapping
    public List<JobApplication> getAllJobs() {
        return jobApplicationService.getAllJobs();
    }

    @GetMapping("/{id}")
    public JobApplication getJobById(@PathVariable Long id) {
        return jobApplicationService.getJobById(id);
    }

    @PostMapping
    public JobApplication saveJob(@RequestBody JobApplication job){
        return jobApplicationService.saveJob(job);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable long id) {
        jobApplicationService.deleteJob(id);
    }

}
