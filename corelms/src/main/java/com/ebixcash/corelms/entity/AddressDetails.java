package com.ebixcash.corelms.entity;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.ebixcash.accounts.entity.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tLmsAddressDetails")
public class AddressDetails extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iAddressId;

	

	@Column(columnDefinition = "NUMBER(20)")
	private Integer iCustomerId;
	@Column(length = 30)
	private String tCity;
	@Column(length = 30)
	private String tState;
	@Column(length = 60)
	private String tAddress1;
	@Column(length = 60)
	private String tAddress2;
	@Column(length = 50)
	private String tAddress3;
	@Column(length = 15)
	private String tPostalCode;
	@Column(length = 20)
	private String tLandLineNo;
	@Column(length = 60)
	private String tLandmark;
	

}
