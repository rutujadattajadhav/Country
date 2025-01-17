package com.rutuja.country.exception;

import com.rutuja.country.error.Error;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;

import java.util.List;



public class ServiceException extends Exception {
List<Error> errorMessage;

    public List<Error> getErrorMessage() {
        return errorMessage;
    }

    public ServiceException(List<Error> errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ServiceException(String message, List<Error> errorMessage) {
        super(message);
        this.errorMessage = errorMessage;
    }

    public ServiceException(String message, Throwable cause, List<Error> errorMessage) {
        super(message, cause);
        this.errorMessage = errorMessage;
    }

    public ServiceException(Throwable cause, List<Error> errorMessage) {
        super(cause);
        this.errorMessage = errorMessage;
    }

    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, List<Error> errorMessage) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorMessage = errorMessage;
    }
}
