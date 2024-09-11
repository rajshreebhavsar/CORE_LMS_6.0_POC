package com.ebixcash.spring_boot_lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebixcash.spring_boot_lms.model.AddressDetails;
import com.ebixcash.spring_boot_lms.model.BankDetails;

@Repository
public interface BankRepository extends JpaRepository<BankDetails, Long> {

	BankDetails save(BankDetails bank);
}

