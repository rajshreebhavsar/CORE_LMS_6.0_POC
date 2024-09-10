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
@Table(name = "tLmsProductDetails")
public class ProductDetails extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iProductId;

	@Column(length = 20)
	private String tLoanAccountNo;
	@Column(length = 20)
	private String tProductCode;
	private Number iAddressSrno;
	private Number iMinTenor;
	private Number iMaxTenor;
	private Number fMinInstAmt;
	private Number fMaxInstAmt;
	private Number fMinIntRate;
	private char cInterestType;
	private Number iIntCalcMethod;
	private Number iInstType;
	private Number iCompoundingFreq;
	private Number iIntRest;
	private Number iInternalIntBasis;
	private Number fEquatedPrinFrq;
	private Number cBpiRecovery;
	private Number iEmiCalcMethod;
	@Column(length = 5)
	private String tAssetCostOption;
	@Column(length = 4)
	private String tProductType;
	private Number fPenalRate;
	private String tLendingTypeCode;
	private String tAssetClassCode;
	private Number fMaxIntRate;
	private char cAdjAdvanceInstStartYn;
	private char cAdjAdvanceInstEndYn;
	private char cBalloonInterYn;
	private char cBalloonEndTenorYn;
	private char cInitSkipYn;
	private char cIntermitSkipYn;
	private char cStepDownAllowedYn;
	private char cStepUpAllowedYn;
	private char cSkipBasis;
	private Number fSpecDay;
	private Number fMinRestrucAmt;
	private Number fMaxPrincipalWaiverAllowed;
	private char cTdsApplicabilityYn;
	private Number fMaxLoanAmount;
	private Number iMinAge;
	private Number iMaxAge;
	private Number fMinPrepayAmt;
	private Number fMinInstGapBetweenPrepay;
	private Number iRegMarkLoanAfterRestruc;
	private Number fPrepayAfInstNo;
	private Number fPrepayBfInstNo;
	private Number fForeclosureAfInstNo;
	private Number fForeclosureBfInstNo;
	
}