package com.example.invoicecustomermanager.exception;

public class ApiException extends RuntimeException {
   public ApiException(String message) {
       super(message);
   }
}
