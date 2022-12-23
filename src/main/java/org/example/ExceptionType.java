package org.example;

public enum ExceptionType {
    INVALID_DATE_INPUT("Invalid date input"),

    NULL_EXCEPTION("No data present");
    public final String message;

    ExceptionType(String message) {
        this.message = message;
    }
}
