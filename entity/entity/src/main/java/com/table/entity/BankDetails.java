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
@Table(name = "tLmsBankDetails")
public class BankDetails extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iBankId;

	private Number iCustomerId;
	private Number iSrno;
	@Column(length = 60)
	private String tBankCode;
	@Column(length = 60)
	private String tBranchCode;
	@Column(length = 15)
	private String tAccountType;
	private LocalDate dtAccountSince;
	private Number fAvgBalance;
	private char cUseForRepaymentYn;
	private Number iAddressSrno;
	@Column(length = 15)
	private String tIfscCode;


}
