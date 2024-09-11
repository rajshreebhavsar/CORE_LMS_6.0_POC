package com.ebixcash.corelms.entity;

import java.time.LocalDate;

import com.ebixcash.corelms.entity.BaseEntity;

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

	@Column(columnDefinition = "NUMBER(20)")
	private Number iCustomerId;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iSrno;
	@Column(length = 60)
	private String tBankCode;
	@Column(length = 60)
	private String tBranchCode;
	@Column(length = 15)
	private String tAccountType;
	private LocalDate dtAccountSince;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fAvgBalance;
	private char cUseForRepaymentYn;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iAddressSrno;
	@Column(length = 15)
	private String tIfscCode;


}
