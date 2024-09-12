package com.ebixcash.corelms.service;

import com.ebixcash.corelms.dto.MasterAgreementDto;

public interface ImasterAgreementService {
	
	    void createMasterAgreement(MasterAgreementDto masterAgreementDto);

	    MasterAgreementDto fetchAccount(String customerNo);
	    
	    boolean updateMasterAgreement(MasterAgreementDto masterAgreementDto);

	   
	    boolean deleteMasterAgreement(String masterAgreement);

	
}
