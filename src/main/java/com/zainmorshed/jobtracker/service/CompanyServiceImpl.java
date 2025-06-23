package com.zainmorshed.jobtracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;
import com.zainmorshed.jobtracker.model.Company;
import com.zainmorshed.jobtracker.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {
    // Implement methods from CompanyService here
    // For example:
    // @Override
    // public void addCompany(Company company) {
    //     // Implementation code
    // }
    
    // Other service methods can be added as needed

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public List<Company> getAllCompany(){
        return companyRepository.findAll();
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCompany(Long id){
        if (companyRepository.existsById(id)) {
            companyRepository.deleteById(id);
        } else {
            throw new RuntimeException("Company not found with id: " + id);
        }
    }

    @Override
    public Company updateCompany(Long id, Company company) {
        Optional<Company> existingCompany = companyRepository.findById(id);
        if (existingCompany.isPresent()) {
            Company updatedCompany = existingCompany.get();
            updatedCompany.setName(company.getName());
            updatedCompany.setAddress(company.getAddress());
            updatedCompany.setPhoneNumber(company.getPhoneNumber());
            return companyRepository.save(updatedCompany);
        } else {
            throw new RuntimeException("Company not found with id: " + id);
        }
    }

}
