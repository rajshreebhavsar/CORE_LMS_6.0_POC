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
@Table(name = "tLmsScheduleHeader")
public class ScheduleHeader extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iScheduleId;

	// @Column(name = "tLoanAccountNo", length = 200)
	@Column(length = 20)
	private String tLoanAccountNo;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iSrno;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iInstallmentFrom;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iInstallmentTo;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fInstallmentAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fInterestRate;
	@Column(columnDefinition = "NUMBER(30)")
	private Number tIndexCode;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fIndex;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fOffset;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fSpread;
	private char cRepayFreq;
	private char cInterestType;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fInternalIrr;
	@Column(length = 50)
	private String tSpreadCode;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fEquatedPrinFrq;
	@Column(length = 60)
	private String tIndexDesc;
	@Column(length = 60)
	private String tSpreadDesc;

}