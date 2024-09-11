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
@Table(name = "tLmsScheduleVariations")
public class ScheduleVariations extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iVariationId;

	// @Column(name = "tLoanAccountNo", length = 200)
	@Column(length = 20)
	private String tLoanAccountNo;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iSrno;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iInstallmentFrom;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iInstallmentTo;
	@Column(columnDefinition = "NUMBER(1)")
	private Number fAdjustment;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fValue;
	@Column(length = 40)
	private String tVariationType;
	

}