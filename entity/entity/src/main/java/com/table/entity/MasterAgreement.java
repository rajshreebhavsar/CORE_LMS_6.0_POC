package com.table.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

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
@Table(name = "tLmsMasterAgreement")
public class MasterAgreement extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tAgreementNo;

	@Column(length = 10)
	private String tPortfolioCode;
	private LocalDate dtValidFrom;
	private LocalDate dtValidTo;
	private Number fSanctionAmt;
	private Number tCustomerNo;
	@Column(length = 20)
	private String tApplicationNo;
	@Column(length = 10)
	private String tCurrencyCode;

}