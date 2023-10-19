package com.geekster.AssignmentUserManagement.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

        @Id
        @NotNull(message = "userId cannot be null")
        private Integer userId;
        private String userName;

        @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Date of birth must be in yyyy-mm-dd format")
        private String dateOfBirth;


        @Email(message = "Invalid email format. Please enter a valid Email!")
        private String userEmail;

        @Size(min = 12,max = 12)
        @Pattern( regexp = "9[0-9]{10}$",message = "Enter a Valid Phone Number,Phone number must start with 91 and be followed by 10 digits")
        private  String userContactNo;

        @NotNull(message = "Date cannot be null")
        @Past(message = "Date must be in the past")
        private LocalDateTime dateTime = LocalDateTime.now();





}
