package com.rutuja.country.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;



@ToString
public class Error {
    private String errorMsg;
    private String errorKey;

    public String getErrorMsg() {
        return errorMsg;
    }

    public String getErrorKey() {
        return errorKey;
    }

    public Error(String errorMsg, String errorKey) {
        this.errorMsg = errorMsg;
        this.errorKey = errorKey;
    }
}
