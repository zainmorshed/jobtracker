package com.zainmorshed.jobtracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JobApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jobTitle;
    private String companyName;
    private String applicationDate;
    private Status status;

    public JobApplication(String jobTitle, String companyName, String applicationDate, Status status) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.applicationDate = applicationDate;
        this.status = status;
    }

    public JobApplication() {
        // Default constructor for JPA
    }
    

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
