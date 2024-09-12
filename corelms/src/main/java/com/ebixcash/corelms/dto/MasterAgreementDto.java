package com.ebixcash.corelms.dto;

import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "MasterAgreement",
        description = "Schema to hold MasterAgreement information"
)
public class MasterAgreementDto {

	@Schema(
            description = "Portfolio Code", example = "ML"
            )
    @NotEmpty(message = "Portfolio Code can not be a null or empty")
    @Size(min = 5, max = 30, message = "The length of Portfolio Code should be between 5 and 30")
    private String tPortfolioCode;
    
    
    @Schema(
            description = "Valid From", example = "dd/MM/YYYY"
            )
    @NotEmpty(message="Valid From date can not be a null or empty")
    private LocalDate dtValidFrom;
    
    
    @Schema(
            description = "Valid To", example = "dd/MM/YYYY"
            )
    @NotEmpty(message="Valid To date can not be a null or empty")
    private LocalDate dtValidTo;
    
    
    @Schema(
            description = "Sanction Amount", example = "10000"
            )
    @NotEmpty(message="Sanction Amount can not be a null or empty")
    @Size(min= 5, max = 10, message="")        
    private Number fSanctionAmt;
    
    
    @Schema(
            description = "Customer Number", example = "123456"
            )
    @NotEmpty(message="Customer Number can not be a null or empty")
    @Size(min= 5, max = 30, message="")
    private Number tCustomerNo;
    
    
    @Schema(
            description = "Application Number", example = "App1001"
            )
    @NotEmpty(message="Application Number can not be a null or empty")
    @Size(min=5, max = 30, message="")
    private String tApplicationNo;
    
    
    @Schema(
            description = "Currency Code", example = ""
            )
    @NotEmpty(message="Currency Code can not be a null or empty")
    @Size(min= 1 ,max= 10 , message="")
    private String tCurrencyCode;
}
