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

	private Number iStaticFeeID;
	private Number iSrno;
	private Number fChargeAmount;
	private Number fMinAmtPer;
	private Number fMaxAmtPer;
	private Number fChrgePercnt;
	@Column(length = 20)
	private String szChargeCode;
	@Column(length = 20)
	private String szChargeType;
	@Column(length = 20)
	private String szChargeBasisCode;
	@Column(length = 20)
	private String szApplicableModule;
	@Column(length = 20)
	private String szApplicableFor;
	private char cTaxType;
	private char cApplicableAllYn;
	@Column(length = 20)
	private String szChargeBasisValuecode;


}