package org.isdb.email.dto;

import org.isdb.email.constants.Role;

import jakarta.validation.constraints.Email;

public record UserUpdateRequest(@Email(message = "Email should be valid") String email,

		Role role, String firstName, String lastName, String phoneNumber) {
}
