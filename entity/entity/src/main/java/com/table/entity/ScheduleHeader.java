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
@Table(name = "tLmsScheduleHeader")
public class ScheduleHeader extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iScheduleId;

	// @Column(name = "tLoanAccountNo", length = 200)
	@Column(length = 20)
	private String tLoanAccountNo;
	private Number iSrno;
	private Number iInstallmentFrom;
	private Number iInstallmentTo;
	private Number fInstallmentAmt;
	private Number fInterestRate;
	private Number tIndexCode;
	private Number fIndex;
	private Number fOffset;
	private Number fSpread;
	private char cRepayFreq;
	private char cInterestType;
	private Number fInternalIrr;
	@Column(length = 50)
	private String tSpreadCode;
	private Number fEquatedPrinFrq;
	@Column(length = 60)
	private String tIndexDesc;
	@Column(length = 60)
	private String tSpreadDesc;


}