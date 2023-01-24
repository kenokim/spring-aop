package com.example.springadvanced.trace.strategy.code;

public class StrategyLogic1 implements Strategy {
    @Override
    public void call() {
        System.out.println("로직1");
    }
}
