package com.validation.serversidevalidation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty
    @Size(min = 3, max = 20, message = "First name should be atleast of 3 character")
    private String firstName;
    @NotEmpty
    @Size(min = 3, max = 20, message = "First name should be atleast of 3 character")
    private String lastName;
    @NotEmpty
    @Size(min = 3, max = 20, message = "Email name should be atleast of 3 character")
    @Email
    private String email;
    @NotEmpty
    @Size(min = 5, max = 20, message = "Password should be atleast of 5 character")
    private String password;
}
