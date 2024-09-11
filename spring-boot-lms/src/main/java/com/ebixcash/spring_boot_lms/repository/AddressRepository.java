package com.ebixcash.spring_boot_lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebixcash.spring_boot_lms.model.AddressDetails;

@Repository
public interface AddressRepository extends JpaRepository<AddressDetails, Long> {
}

