package com.ebixcash.spring_boot_lms.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "T_LMS_CUSTOMER_DETAILS")
public class CustomerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long i_customer_id;

    private String c_cust_category_code;
    private String c_vip_yn;
    private Date dt_org_incorporation_date;
    private String t_customer_no;
    private String t_fname;
    private String t_lname;
    private String t_email1;
	public Long getI_customer_id() {
		return i_customer_id;
	}
	public void setI_customer_id(Long i_customer_id) {
		this.i_customer_id = i_customer_id;
	}
	public String getC_cust_category_code() {
		return c_cust_category_code;
	}
	public void setC_cust_category_code(String c_cust_category_code) {
		this.c_cust_category_code = c_cust_category_code;
	}
	public String getC_vip_yn() {
		return c_vip_yn;
	}
	public void setC_vip_yn(String c_vip_yn) {
		this.c_vip_yn = c_vip_yn;
	}
	public Date getDt_org_incorporation_date() {
		return dt_org_incorporation_date;
	}
	public void setDt_org_incorporation_date(Date dt_org_incorporation_date) {
		this.dt_org_incorporation_date = dt_org_incorporation_date;
	}
	public String getT_customer_no() {
		return t_customer_no;
	}
	public void setT_customer_no(String t_customer_no) {
		this.t_customer_no = t_customer_no;
	}
	public String getT_fname() {
		return t_fname;
	}
	public void setT_fname(String t_fname) {
		this.t_fname = t_fname;
	}
	public String getT_lname() {
		return t_lname;
	}
	public void setT_lname(String t_lname) {
		this.t_lname = t_lname;
	}
	public String getT_email1() {
		return t_email1;
	}
	public void setT_email1(String t_email1) {
		this.t_email1 = t_email1;
	}
  
}
