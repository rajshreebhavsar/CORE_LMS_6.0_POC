package com.ebixcash.spring_boot_lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebixcash.spring_boot_lms.model.AddressDetails;
import com.ebixcash.spring_boot_lms.model.BankDetails;
import com.ebixcash.spring_boot_lms.model.CustomerDetails;
import com.ebixcash.spring_boot_lms.model.LMSRequest;
import com.ebixcash.spring_boot_lms.service.LMSService;


@RestController
@RequestMapping("/api/lms")
public class LMSController {

    @Autowired
    private LMSService lmsService;

    @PostMapping("/manage")
    public ResponseEntity<String> manageData(@RequestBody LMSRequest lmsRequest) {
        lmsService.manageData(lmsRequest);
        return ResponseEntity.ok("Data processed successfully");
    }
}
