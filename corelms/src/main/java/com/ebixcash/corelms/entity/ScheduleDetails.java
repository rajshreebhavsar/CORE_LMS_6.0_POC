package com.ebixcash.corelms.entity;

import java.time.LocalDate;

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
@Table(name = "tLmsScheduleDetails")
public class ScheduleDetails extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iScheduleDtlId;

	// @Column(name = "cInstPayOpt", length = 200)
	@Column(columnDefinition = "NUMBER(22)")
	private Number iScheduleId;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iInstallmentNo;
	private LocalDate dtInstallmentdue;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fPrinamt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fIntamt;
	private char cIncomeRec;
	private char cInstPayOpt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fTdsAmount;
	private char cTdsAppliedYn;
	private char cEcsPostedYn;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fClosingBal;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fTotIntAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fSubventionAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fIntWaiverAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fMaxWithdraw;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fDroplineBalance;
	

}