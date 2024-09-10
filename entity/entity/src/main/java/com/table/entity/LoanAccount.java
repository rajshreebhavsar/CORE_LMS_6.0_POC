package com.table.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.ebixcash.accounts.entity.BaseEntity;

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
@Table(name = "tLmsLoanAccount")
public class LoanAccount extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tLoanAccountNo;

	@Column(length = 20)
	private String tAgreementNo;
	@Column(length = 20)
	private String tOrgBranchCode;
	private char tDisbursementOption;
	@Column(length = 20)
	private String tPaymentRecoveryMode;
	private char cAccountStatus;
	private char cFinalDisbYn;
	private Number iCycleDay;
	private LocalDate dtStatusChange;
	private char cAdditionalStatus;
	private char cAssetBackedYn;
	private Number cRepayFreq;
	private char cExcessAdjYn;
	private char tIntAccrualFreq;
	private Number fSanctionedAmt;
	private char cInstPayOpt;
	private LocalDate dtFirstDue;
	private char tRoundingType;
	private Number fAdvAmt;
	private Number iNoOfEmi;
	private char tAdvanceEmiType;
	@Column(length = 60)
	private String tSourceBranchCode;
	private Number iMaxPreEmiPeriod;
	private char cPreEmiPeriodAllowed;
	private LocalDate dtEmiConversion;
	private char tMigrationYn;
	@Column(length = 50)
	private String tOldLoanAccountNo;
	@Column(length = 50)
	private String tNewLoanAccountNo;
	private Number fBalanceTransfer;
	private char cGstExempted;
	private char cNocBlockedYn;
	@Column(length = 100)
	private String tNocRemark;
	@Column(length = 2)
	private String cBpiRecoveryMethod;

	
}	
