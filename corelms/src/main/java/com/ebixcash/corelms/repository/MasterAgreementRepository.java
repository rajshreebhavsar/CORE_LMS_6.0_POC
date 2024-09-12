package com.ebixcash.corelms.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.ebixcash.corelms.entity.MasterAgreement;

import java.util.Optional;

@Repository
public interface MasterAgreementRepository extends JpaRepository<MasterAgreement, Long> {

    Optional<MasterAgreement> findByAgreementNo(Long agreementNo);

    @Transactional
    @Modifying
    void deleteByAgreementNo(Long agreementNo);

}
