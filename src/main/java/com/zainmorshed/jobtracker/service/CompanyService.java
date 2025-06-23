package com.zainmorshed.jobtracker.service;

import java.util.List;
import com.zainmorshed.jobtracker.model.Company;

public interface CompanyService {
    Company saveCompany(Company company);
    List<Company> getAllCompany();
    Company getCompanyById(Long id);
    void deleteCompany(Long id);
    Company updateCompany(Long id, Company company);
}

