package com.ebixcash.corelms.entity;

import  com.ebixcash.corelms.entity.BaseEntity;

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
	@Column(columnDefinition = "NUMBER(22)")
	private Number iMinTenor;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iMaxTenor;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fMinInstAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fMaxInstAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fMinIntRate;
	private char cInterestType;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iIntCalcMethod;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iInstType;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iCompoundingFreq;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iIntRest;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iInternalIntBasis;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fEquatedPrinFrq;
	@Column(columnDefinition = "NUMBER(22)")
	private Number cBpiRecovery;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iEmiCalcMethod;
	@Column(length = 5)
	private String tAssetCostOption;
	@Column(length = 4)
	private String tProductType;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fPenalRate;
	private String tLendingTypeCode;
	private String tAssetClassCode;
	@Column(columnDefinition = "NUMBER(22)")
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
	@Column(columnDefinition = "NUMBER(22)")
	private Number fSpecDay;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fMinRestrucAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fMaxPrincipalWaiverAllowed;
	private char cTdsApplicabilityYn;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fMaxLoanAmount;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iMinAge;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iMaxAge;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fMinPrepayAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fMinInstGapBetweenPrepay;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iRegMarkLoanAfterRestruc;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fPrepayAfInstNo;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fPrepayBfInstNo;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fForeclosureAfInstNo;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fForeclosureBfInstNo;
	
}
