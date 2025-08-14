package com.akshay.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto{

    @NotEmpty(message = "Account Number cannot be empty")
    @Pattern(regexp = "^$|[0-9]{10}", message = "Account Number must contain 10 digits")
    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
