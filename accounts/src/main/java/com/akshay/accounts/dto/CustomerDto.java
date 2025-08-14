package com.akshay.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name cannot be null")
    private String name;

    @NotEmpty(message = "Email cannot be null")
    @Email(message = "Enter a valid email address")
    private String email;

    @NotEmpty(message = "Mobile Number cannot be empty")
    @Pattern(regexp = "^$|[0-9]{10}")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
