package org.example;

import java.text.ParseException;
import java.util.function.Supplier;

public class CustomException extends Exception {
    public CustomException(ExceptionType e) {
        super(e.message);
    }
}
