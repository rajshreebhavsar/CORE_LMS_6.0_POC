package com.ebixcash.corelms.entity;

import java.time.LocalDate;

import com.ebixcash.corelms.entity.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tLmsCustomerDetails")
public class CustomerDetails extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iCustomerId;

	@Column(length = 20)
	private String tLoanAccountNo;
	@Column(length = 20)
	private String tCustomerNo;
	@Column(length = 15)
	private String tTitle;
	@Column(length = 80)
	private String tFname;
	@Column(length = 80)
	private String tMname;
	@Column(length = 80)
	private String tLname;
	@Column(columnDefinition = "NUMBER(10)")
	private Number iAddressSeq;
	@Column(length = 2)
	private String tPrefAddType;
	@Column(length = 25)
	private String tFruadStatus;
	@Column(length = 30)
	private String tMobile1;
	@Column(length = 30)
	private String tMobile2;
	private char cVipYn;
	@Column(length = 60)
	private String tEmail1;
	@Column(length = 60)
	private String tEmail2;
	@Column(length = 20)
	private String tPhone;
	@Column(length = 30)
	private String tPrefContactTimeFrom;
	@Column(length = 30)
	private String tPrefContactTimeTill;
	private char cCustCategoryCode;
	@Column(length = 20)
	private String tModeOfCommunication;
	@Column(length = 200)
	private String tRemark;
	@Column(length = 30)
	private String tMobile3;
	private LocalDate dtStatusat;
	@Column(length = 10)
	private String tEmployeeId;
	@Column(length = 50)
	private String tReason;
	@Column(length = 60)
	private String tHomeBranch;
	private char tMigrationYn;
	@Column(length = 50)
	private String tOldCustNo;
	@Column(length = 60)
	private String tGstin;
	@Column(length = 50)
	private String tAadharNo;
	@Column(length = 50)
	private String tResidenceSts;
	@Column(length = 60)
	private String cRelatedParty;
	@Column(length = 60)
	private String tOrgName;
	@Column(length = 15)
	private String tOrgTypeCode;
	@Column(length = 20)
	private String tOrgIndustryType;
	@Column(length = 30)
	private String tOrgRegistrationNo;
	@Column(length = 15)
	private String tOrgBusinessTypeCode;
	private LocalDate dtOrgRegistration;
	private LocalDate dtOrgIncorporationDate;
	@Column(columnDefinition = "NUMBER(33)")
	private Number iOrgNoOfEmployees;
	private LocalDate dtOrgOperatingSince;
	@Column(length = 60)
	private String tOrgContactPerson;
	@Column(length = 20)
	private String tOrgContactPersonMobile;
	@Column(length = 60)
	private String tOrgDesignation;
	@Column(length = 60)
	private String tOrgUrl;
	@Column(length = 30)
	private String tOrgFax;
	
}
