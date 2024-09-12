package com.ebixcash.corelms.entity;

import java.time.LocalDate;

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
@Table(name = "tLmsMasterAgreement")
public class MasterAgreement extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tAgreementNo;

	@Column(length = 10)
	private String tPortfolioCode;
	private LocalDate dtValidFrom;
	private LocalDate dtValidTo;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fSanctionAmt;
	@Column(columnDefinition = "NUMBER(20)")
	private Number tCustomerNo;
	@Column(length = 20)
	private String tApplicationNo;
	@Column(length = 10)
	private String tCurrencyCode;

}