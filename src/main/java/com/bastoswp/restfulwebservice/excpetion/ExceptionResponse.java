package com.bastoswp.restfulwebservice.excpetion;

import java.util.Date;

public class ExceptionResponse {
    public ExceptionResponse(Date timestamp, String message, String details) {
        setTimestamp(timestamp);
        setMessage(message);
        setDetails(details);
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public String getMessage() {
        return this.message;
    }

    public String getDetails() {
        return this.details;
    }

    protected void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    protected void setMessage(String message) {
        this.message = message;
    }

    protected void setDetails(String details) {
        this.details = details;
    }

    private Date timestamp;
    private String message;
    private String details;
}