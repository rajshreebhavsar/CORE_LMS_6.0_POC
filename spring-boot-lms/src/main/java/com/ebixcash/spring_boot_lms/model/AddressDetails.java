package com.ebixcash.spring_boot_lms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "T_LMS_ADDRESS_DETAILS")
public class AddressDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long i_address_id;

    private Long i_customer_id;
    private String t_postal_code;
    private String t_land_line_no;
    private String t_city;
    private String t_state;
    private String t_address1;
    private String t_address2;
    private String t_address3;
    private String t_landmark;
	public Long getI_address_id() {
		return i_address_id;
	}
	public void setI_address_id(Long i_address_id) {
		this.i_address_id = i_address_id;
	}
	public Long getI_customer_id() {
		return i_customer_id;
	}
	public void setI_customer_id(Long i_customer_id) {
		this.i_customer_id = i_customer_id;
	}
	public String getT_postal_code() {
		return t_postal_code;
	}
	public void setT_postal_code(String t_postal_code) {
		this.t_postal_code = t_postal_code;
	}
	public String getT_land_line_no() {
		return t_land_line_no;
	}
	public void setT_land_line_no(String t_land_line_no) {
		this.t_land_line_no = t_land_line_no;
	}
	public String getT_city() {
		return t_city;
	}
	public void setT_city(String t_city) {
		this.t_city = t_city;
	}
	public String getT_state() {
		return t_state;
	}
	public void setT_state(String t_state) {
		this.t_state = t_state;
	}
	public String getT_address1() {
		return t_address1;
	}
	public void setT_address1(String t_address1) {
		this.t_address1 = t_address1;
	}
	public String getT_address2() {
		return t_address2;
	}
	public void setT_address2(String t_address2) {
		this.t_address2 = t_address2;
	}
	public String getT_address3() {
		return t_address3;
	}
	public void setT_address3(String t_address3) {
		this.t_address3 = t_address3;
	}
	public String getT_landmark() {
		return t_landmark;
	}
	public void setT_landmark(String t_landmark) {
		this.t_landmark = t_landmark;
	}

}
