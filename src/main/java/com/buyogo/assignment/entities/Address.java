package com.buyogo.assignment.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


//POJO for Address
@Data
public class Address {

    @NotBlank(message = "Detailed address is required")
    private String detailedAddress;

    @NotBlank(message = "city is Required")
    private String city;

    @NotBlank(message = "State is Required")
    private String state;

    @NotBlank(message = "pinCode is Required")
    @Pattern(regexp = "^[0-9]{6}$", message = "Invalid pincode")
    private String pinCode;
}


