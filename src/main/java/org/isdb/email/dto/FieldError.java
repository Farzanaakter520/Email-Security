package org.isdb.email.dto;

public record FieldError(String field, String errorCode, String errorMessage) {
}