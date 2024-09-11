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
@Table(name = "tLmsRangeBasisStaticFee")
public class RangeBasisStaticFee extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iRangeFeeID;

	@Column(columnDefinition = "NUMBER(22)")
	private Number iStaticFeeID;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iSrno;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fChargeAmount;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fMinAmtPer;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fMaxAmtPer;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fChrgePercnt;
	@Column(length = 20)
	private String tChargeCode;
	@Column(length = 20)
	private String tChargeType;
	@Column(length = 20)
	private String tChargeBasisCode;
	@Column(length = 20)
	private String tApplicableModule;
	@Column(length = 20)
	private String tApplicableFor;
	private char cTaxType;
	private char cApplicableAllYn;
	@Column(length = 20)
	private String tChargeBasisValuecode;


}