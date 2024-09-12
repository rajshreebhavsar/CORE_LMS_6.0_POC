package com.ebixcash.corelms.mapper;


import com.ebixcash.corelms.dto.MasterAgreementDto;
import com.ebixcash.corelms.entity.MasterAgreement;

public class MasterAgreementMapper {

    public static MasterAgreementDto mapToMasterAgreementDto(MasterAgreement MasterAgreement, MasterAgreementDto masterAgreementDto) {
    	
    	masterAgreementDto.setTCurrencyCode(MasterAgreement.getTCurrencyCode());
    	masterAgreementDto.setTPortfolioCode(MasterAgreement.getTPortfolioCode());
    	masterAgreementDto.setDtValidFrom(MasterAgreement.getDtValidFrom());
    	masterAgreementDto.setDtValidTo(MasterAgreement.getDtValidTo());
    	masterAgreementDto.setFSanctionAmt(MasterAgreement.getFSanctionAmt());
    	masterAgreementDto.setTCustomerNo(MasterAgreement.getTCustomerNo());
    	masterAgreementDto.setTApplicationNo(MasterAgreement.getTApplicationNo());
        return masterAgreementDto;
    }

    public static MasterAgreement mapToMasterAgreement(MasterAgreementDto masterAgreementDto, MasterAgreement masterAgreement) {
    	masterAgreement.setTCurrencyCode(masterAgreementDto.getTCurrencyCode());
    	masterAgreement.setTPortfolioCode(masterAgreementDto.getTPortfolioCode());
    	masterAgreement.setDtValidFrom(masterAgreementDto.getDtValidFrom());
    	masterAgreement.setDtValidTo(masterAgreementDto.getDtValidTo());
    	masterAgreement.setFSanctionAmt(masterAgreementDto.getFSanctionAmt());
    	masterAgreement.setTCustomerNo(masterAgreementDto.getTCustomerNo());
    	masterAgreement.setTApplicationNo(masterAgreementDto.getTApplicationNo());
        return masterAgreement;
    }

}
