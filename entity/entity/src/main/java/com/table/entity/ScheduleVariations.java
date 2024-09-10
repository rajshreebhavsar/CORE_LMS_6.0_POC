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
@Table(name = "tLmsScheduleVariations")
public class ScheduleVariations extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iVariationId;

	// @Column(name = "tLoanAccountNo", length = 200)
	@Column(length = 20)
	private String tLoanAccountNo;
	private Number iSrno;
	private Number iInstallmentFrom;
	private Number iInstallmentTo;
	private Number fAdjustment;
	private Number fValue;
	private Number tVariationType;
	

}