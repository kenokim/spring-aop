package com.example.springadvanced.trace.threadlocal;

public class ThreadLocalService {
    private ThreadLocal<String> nameStore = new ThreadLocal<>();

    public String logic() {
        nameStore.set("Hello" + Thread.currentThread());
        return nameStore.get();
    }
}
