package com.dockertest.DockerTestProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTestController {
    @RequestMapping("/")
    public Map<String, Object> getValues() {
        Map<String, Object> data = new HashMap<>();
        data.put("message", "SpringBoot dockerization test");
        data.put("technologies", Arrays.asList("Java", "SpringBoot", "Docker"));
        data.put("devCode", 1234);
        data.put("developer", "Agniswar Das");
        return data;
    }
}
