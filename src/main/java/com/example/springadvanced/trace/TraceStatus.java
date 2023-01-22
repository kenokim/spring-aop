package com.example.springadvanced.trace;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TraceStatus {
    private TraceId traceId;
    private Long startTimeMs;
    private String message;

    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public String getMessage() {
        return message;
    }

    public TraceId getTraceId() {
        return traceId;
    }
}
