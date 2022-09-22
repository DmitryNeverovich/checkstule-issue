package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

import static org.apache.commons.collections4.SetUtils.emptyIfNull;
import static org.apache.commons.collections4.CollectionUtils.emptyIfNull;

@RestController
public final class ExampleClass {

    /**
     * test.
     */
    @GetMapping("/atest")
    public void test() {
        System.out.println(emptyIfNull(Set.of("1", "2")));
        System.out.println(emptyIfNull(Set.of("1", "2")));
    }
}
