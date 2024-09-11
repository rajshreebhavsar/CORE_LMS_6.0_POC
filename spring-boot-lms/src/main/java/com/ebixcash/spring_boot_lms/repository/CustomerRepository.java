package com.ebixcash.spring_boot_lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebixcash.spring_boot_lms.model.AddressDetails;
import com.ebixcash.spring_boot_lms.model.CustomerDetails;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDetails, Long> {
}

