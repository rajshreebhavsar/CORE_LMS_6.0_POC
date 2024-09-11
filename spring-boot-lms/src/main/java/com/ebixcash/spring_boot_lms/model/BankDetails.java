package com.ebixcash.spring_boot_lms.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "T_LMS_BANK_DETAILS")
public class BankDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long i_bank_id;

    private String c_use_for_repayment_yn;
    private Date dt_account_since;
    private String t_account_type;
    private String t_ifsc_code;
    private String t_bank_code;
    private String t_branch_code;
    private Double f_avg_balance;
    private Long i_customer_id;
	public Long getI_bank_id() {
		return i_bank_id;
	}
	public void setI_bank_id(Long i_bank_id) {
		this.i_bank_id = i_bank_id;
	}
	public String getC_use_for_repayment_yn() {
		return c_use_for_repayment_yn;
	}
	public void setC_use_for_repayment_yn(String c_use_for_repayment_yn) {
		this.c_use_for_repayment_yn = c_use_for_repayment_yn;
	}
	public Date getDt_account_since() {
		return dt_account_since;
	}
	public void setDt_account_since(Date dt_account_since) {
		this.dt_account_since = dt_account_since;
	}
	public String getT_account_type() {
		return t_account_type;
	}
	public void setT_account_type(String t_account_type) {
		this.t_account_type = t_account_type;
	}
	public String getT_ifsc_code() {
		return t_ifsc_code;
	}
	public void setT_ifsc_code(String t_ifsc_code) {
		this.t_ifsc_code = t_ifsc_code;
	}
	public String getT_bank_code() {
		return t_bank_code;
	}
	public void setT_bank_code(String t_bank_code) {
		this.t_bank_code = t_bank_code;
	}
	public String getT_branch_code() {
		return t_branch_code;
	}
	public void setT_branch_code(String t_branch_code) {
		this.t_branch_code = t_branch_code;
	}
	public Double getF_avg_balance() {
		return f_avg_balance;
	}
	public void setF_avg_balance(Double f_avg_balance) {
		this.f_avg_balance = f_avg_balance;
	}
	public Long getI_customer_id() {
		return i_customer_id;
	}
	public void setI_customer_id(Long i_customer_id) {
		this.i_customer_id = i_customer_id;
	}

}

