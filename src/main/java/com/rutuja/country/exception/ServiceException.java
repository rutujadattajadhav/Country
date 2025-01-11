package com.rutuja.country.exception;

import com.rutuja.country.error.Error;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;

import java.util.List;


@AllArgsConstructor
public class ServiceException extends Exception {
List<Error> errorMessage;

    public List<Error> getErrorMessage() {
        return errorMessage;
    }
}
