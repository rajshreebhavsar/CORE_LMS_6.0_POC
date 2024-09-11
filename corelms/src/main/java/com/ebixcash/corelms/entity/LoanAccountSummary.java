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
@Table(name = "tLmsLoanAccountSummary")
public class LoanAccountSummary extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tLoanAccountNo;

	@Column(length = 20)
	private String tAgreementNo;
	private LocalDate dtLastProv;
	@Column(length = 100)
	private String tRevisedRemark;
	private LocalDate dtRevisedNextDue;
	private LocalDate dtPreviousInstDue;
	private LocalDate dtLastTransaction;
	private LocalDate dtRevisedPrevDue;
	private LocalDate dtRestructure;
	@Column(columnDefinition = "NUMBER(22)")
	private Number iSpecificProvDpd;
	@Column(length = 30)
	private String tTypeProduct;
	@Column(length = 10)
	private String tLoanQualityCode;
	private char iDpd;
	@Column(columnDefinition = "NUMBER(22)")
	private Number cDelinquentYn;
	private LocalDate dtNxtBilling;
	private LocalDate dtPreBilling;
	@Column(length = 2000)
	private String tDelinquencyStr;
	private char cRestructureYn;
	private char cCollectionYn;
	private char cAstClsChgYn;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fWriteOffRecoveryAmt;
	private LocalDate dtLastWriteOffRecovery;
	private LocalDate dtNpaClassified;
	private char cBlockStatus;
	private char cErrorYn;
	private LocalDate dtError;
	private LocalDate dtNextInstallment;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fFuturePrincipalAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fExcessAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fTotalDueAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fTotalChargesDueAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fTotalPrinDueAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fTotalIntDueAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fTotalPenalDueAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fTotalBounceChgDueAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fTotalOtherChgDueAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fTotalDebitNoteDueAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fAccruedPenalAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fAccruedInterestAmt;
	private LocalDate dtInstallmentStart;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fTrancheAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fFutPriAmt1;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fAdvEmiAmt;
	private LocalDate dtScheduleGen1;
	private LocalDate dtLastPenalCalculated;
	private LocalDate dtGracePeriodEnd1;
	private LocalDate dtLastIntAccrComputed;
	private LocalDate dtNextIdxReview1;
	private LocalDate dtLastBillingDate;
	private LocalDate dtLastGraceIntCalc1;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fInternalFutPriAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fResidualAmt1;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fDepositAmt;
	private LocalDate dtDepReturn1;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fDownpaymentAmt;
	@Column(columnDefinition = "NUMBER(22)")
	private Number fBalloonLastpayAmt1;
	private LocalDate dtConstructionStart;
	private LocalDate dtConstructionEnd1;
	private LocalDate dtActualConstructionStart;
	private LocalDate dtActualConstructionEnd1;
	private LocalDate dtSubvStartDate;
	private LocalDate dtSubvEndDate1;
	

}