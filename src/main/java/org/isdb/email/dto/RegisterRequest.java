package org.isdb.email.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(

		@NotBlank(message = "Email cannot be blank") @Email(message = "Email should be valid") String email,

		@NotBlank(message = "Password cannot be blank") @Size(min = 6, message = "Password must be at least 6 characters") String password,

		String firstName, String lastName, String phoneNumber) {
}
