package com.example.springadvanced.trace.strategy.code;

public class ContextV2 {

    public void execute(Strategy strategy) {
        long startTime = System.currentTimeMillis();
        strategy.call();
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        System.out.println(resultTime);
    }
}
