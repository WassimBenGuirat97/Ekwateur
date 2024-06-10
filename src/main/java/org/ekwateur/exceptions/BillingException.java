package org.ekwateur.exceptions;

/* This class is designed to accommodate future requirements. */
public class BillingException extends Exception {
    public BillingException(String message) {
        super(message);
    }

    public BillingException(String message, Throwable cause) {
        super(message, cause);
    }
}
