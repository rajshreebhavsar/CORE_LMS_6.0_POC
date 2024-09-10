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
@Table(name = "tLmsScheduleDetails")
public class ScheduleDetails extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iScheduleDtlId;

	// @Column(name = "cInstPayOpt", length = 200)
	private Number iScheduleId;
	private Number iInstallmentNo;
	private LocalDate dtInstallmentdue;
	private Number fPrinamt;
	private Number fIntamt;
	private char cIncomeRec;
	private char cInstPayOpt;
	private Number fTdsAmount;
	private char cTdsAppliedYn;
	private char cEcsPostedYn;
	private Number fClosingBal;
	private Number fTotIntAmt;
	private Number fSubventionAmt;
	private Number fIntWaiverAmt;
	private Number fMaxWithdraw;
	private Number fDroplineBalance;
	

}