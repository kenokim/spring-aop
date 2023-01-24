package com.example.springadvanced.trace.strategy.code;

public class ContextV1 {
    private Strategy strategy;

    public ContextV1(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        long startTime = System.currentTimeMillis();
        strategy.call();
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        System.out.println(resultTime);
    }
}
