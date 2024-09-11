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
	private Number iSpecificProvDpd;
	@Column(length = 30)
	private String tTypeProduct;
	@Column(length = 10)
	private String tLoanQualityCode;
	private char iDpd;
	private Number cDelinquentYn;
	private LocalDate dtNxtBilling;
	private LocalDate dtPreBilling;
	@Column(length = 2000)
	private String tDelinquencyStr;
	private char cRestructureYn;
	private char cCollectionYn;
	private char cAstClsChgYn;
	private Number fWriteOffRecoveryAmt;
	private LocalDate dtLastWriteOffRecovery;
	private LocalDate dtNpaClassified;
	private char cBlockStatus;
	private char cErrorYn;
	private LocalDate dtError;
	private LocalDate dtNextInstallment;
	private Number fFuturePrincipalAmt;
	private Number fExcessAmt;
	private Number fTotalDueAmt;
	private Number fTotalChargesDueAmt;
	private Number fTotalPrinDueAmt;
	private Number fTotalIntDueAmt;
	private Number fTotalPenalDueAmt;
	private Number fTotalBounceChgDueAmt;
	private Number fTotalOtherChgDueAmt;
	private Number fTotalDebitNoteDueAmt;
	private Number fAccruedPenalAmt;
	private Number fAccruedInterestAmt;
	private LocalDate dtInstallmentStart;
	private Number fTrancheAmt;
	private Number fFutPriAmt1;
	private Number fAdvEmiAmt;
	private LocalDate dtScheduleGen1;
	private LocalDate dtLastPenalCalculated;
	private LocalDate dtGracePeriodEnd1;
	private LocalDate dtLastIntAccrComputed;
	private LocalDate dtNextIdxReview1;
	private LocalDate dtLastBillingDate;
	private LocalDate dtLastGraceIntCalc1;
	private Number fInternalFutPriAmt;
	private Number fResidualAmt1;
	private Number fDepositAmt;
	private LocalDate dtDepReturn1;
	private Number fDownpaymentAmt;
	private Number fBalloonLastpayAmt1;
	private LocalDate dtConstructionStart;
	private LocalDate dtConstructionEnd1;
	private LocalDate dtActualConstructionStart;
	private LocalDate dtActualConstructionEnd1;
	private LocalDate dtSubvStartDate;
	private LocalDate dtSubvEndDate1;
	

}