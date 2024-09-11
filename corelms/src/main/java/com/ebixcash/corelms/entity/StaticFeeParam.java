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
@Table(name = "tLmsStaticFeeParam")
public class StaticFeeParam extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iStaticFeeID;

	
	@Column(length = 20)
	private String tLoanAccountNo;
	private Number iSrno;
	@Column(length = 20)
	private String tFeeCode;
	@Column(length = 100)
	private String tFeeCodeDesc;
	@Column(length = 20)
	private String tFeeType;
	@Column(length = 100)
	private String tFeeTypeDesc;
	@Column(length = 20)
	private String tValue;
	@Column(length = 20)
	private String tChargeBasis;
	@Column(length = 20)
	private String tCalcBasis;
	@Column(length = 20)
	private String tCalcType;
	private Number fChargesPercentage;
	private Number fChargeAmount;
	private Number fMinChargeAmount;
	private Number fMaxChargeAmount;
	@Column(length = 20)
	private String tRangeType;
	@Column(length = 20)
	private String tFeeAccountingMethod;
	@Column(length = 20)
	private String tAcbookCode;
	@Column(length = 20)
	private String tEventCode;
	@Column(length = 20)
	private String tEventType;
	private char cActive;
	private char cCostCompApplicableYn;
	@Column(length = 20)
	private String tChargeType;
	@Column(length = 15)
	private String tRecoveryMode;
	@Column(length = 20)
	private String tApplicationNo;
	@Column(length = 20)
	private String tCalcFrom;
	@Column(length = 20)
	private String tApplicableModule;
	@Column(length = 20)
	private String tApplicableFor;
	private char cWaivable;
	@Column(length = 32)
	private String tAvailRuleId;
	@Column(length = 20)
	private String tFromStage;
	@Column(length = 20)
	private String tToStage;
	@Column(length = 20)
	private String tStageDue;
	@Column(length = 20)
	private String tTdsBasis;
	@Column(length = 20)
	private String tFeeTypeCode;
	@Column(length = 20)
	private String tFeeCurrency;
	private char cTaxApplicableYn;
	private char cCgst;
	private char cSgst;
	private char cIgst;
	private char cTaxComputation;
	private char cSystemTax1;

}