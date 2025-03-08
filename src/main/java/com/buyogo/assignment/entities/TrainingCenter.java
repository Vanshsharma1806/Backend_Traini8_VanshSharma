package com.buyogo.assignment.entities;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

// POJO class for the training centers
@Data
//mapping the class to mongoDB collection
@Document(collection = "trainingCenters")

public class TrainingCenter {

    @Id
    private String id;

    @NotBlank
    @Size(max = 40, message = "center Name can not exceed 40 characters ")
    private String centerName;

    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center code must be exactly 12 alphanumeric characters")
    private String centerCode;

    @Valid
    private Address address;

    @Min(value = 1, message = "student capacity must be at least 1")
    private int studentCapacity;


    private List<String> coursesOffered;
    private long createdOn;

    @Email(message = "Invalid Email")
    private String contactEmail;

    @Pattern(regexp = "^[0-9]{10}$", message = "Invalid phone number")
    private String contactPhone;


}
