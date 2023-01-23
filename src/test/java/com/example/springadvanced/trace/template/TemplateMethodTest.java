package com.example.springadvanced.trace.template;

import com.example.springadvanced.trace.template.code.AbstractTemplate;
import com.example.springadvanced.trace.template.code.SubClassLogic1;
import com.example.springadvanced.trace.template.code.SubClassLogic2;
import org.junit.jupiter.api.Test;

public class TemplateMethodTest {
    @Test
    void templateMethodV0() {
        logic1();
        logic2();
    }

    private void logic1() {
        long startTime = System.currentTimeMillis();
        System.out.println("로직1");
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        System.out.println(resultTime);
    }

    private void logic2() {
        long startTime = System.currentTimeMillis();
        System.out.println("로직2");
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        System.out.println(resultTime);
    }

    @Test
    void templateMethodV1() {
        AbstractTemplate template1 = new SubClassLogic1();
        template1.execute();

        AbstractTemplate template2 = new SubClassLogic2();
        template2.execute();
    }

    @Test
    void templateMethodV2() {
        AbstractTemplate template = new AbstractTemplate() {
            @Override
            protected void call() {
                System.out.println("로직1");
            }
        };
        template.execute();
    }
}
