package com.zainmorshed.jobtracker.repository;

// import the Company class from the correct package
import com.zainmorshed.jobtracker.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{
	
}
