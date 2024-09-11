package com.ebixcash.spring_boot_lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebixcash.spring_boot_lms.model.AddressDetails;
import com.ebixcash.spring_boot_lms.model.BankDetails;
import com.ebixcash.spring_boot_lms.model.CustomerDetails;
import com.ebixcash.spring_boot_lms.model.LMSRequest;
import com.ebixcash.spring_boot_lms.repository.AddressRepository;
import com.ebixcash.spring_boot_lms.repository.BankRepository;
import com.ebixcash.spring_boot_lms.repository.CustomerRepository;

import jakarta.transaction.Transactional;

@Service
public class LMSService {

    @Autowired
    private AddressRepository addressDetailsRepository;

    @Autowired
    private BankRepository bankDetailsRepository;

    @Autowired
    private CustomerRepository customerDetailsRepository;

    @Transactional
    public void manageData(LMSRequest lmsRequest) {
        if (lmsRequest.isDeleteFlag()) {
           
            addressDetailsRepository.deleteById(lmsRequest.getAddressDetails().getI_address_id());
            bankDetailsRepository.deleteById(lmsRequest.getBankDetails().getI_bank_id());
            customerDetailsRepository.deleteById(lmsRequest.getCustomerDetails().getI_customer_id());
        } else {
            AddressDetails address = lmsRequest.getAddressDetails();
            address.setI_customer_id(lmsRequest.getI_customer_id());
            addressDetailsRepository.save(address);

            BankDetails bank = lmsRequest.getBankDetails();
            bank.setI_customer_id(lmsRequest.getI_customer_id());
            bankDetailsRepository.save(bank);

            CustomerDetails customer = lmsRequest.getCustomerDetails();
            customerDetailsRepository.save(customer);
       
    }
    }
}
