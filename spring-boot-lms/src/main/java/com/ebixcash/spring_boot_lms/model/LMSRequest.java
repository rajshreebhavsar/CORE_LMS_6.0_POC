package com.ebixcash.spring_boot_lms.model;

public class LMSRequest {
    private Long i_customer_id;
    private boolean deleteFlag;  // Add this flag to the input for deleting records
    private AddressDetails addressDetails;
    private BankDetails bankDetails;
    private CustomerDetails customerDetails;

	public boolean isDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	public Long getI_customer_id() {
		return i_customer_id;
	}
	public void setI_customer_id(Long i_customer_id) {
		this.i_customer_id = i_customer_id;
	}
	public AddressDetails getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(AddressDetails addressDetails) {
		this.addressDetails = addressDetails;
	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
    
}
