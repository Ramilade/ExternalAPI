package com.example.apiex1.api;

import com.example.apiex1.dto.CombinedResponse;
import com.example.apiex1.repository.CombinedResponseRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController

public class DemoController {
    RemoteApiTester remoteApiTester;
    CombinedResponseRepository combinedResponseRepository;

    public DemoController(RemoteApiTester remoteApiTester) {
        this.remoteApiTester = remoteApiTester;
    }

    private final int SLEEP_TIME = 1000 * 3;

    @GetMapping(value = "/random-string-slow")
    public String slowEndpoint() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        return RandomStringUtils.randomAlphanumeric(10);
    }

    @GetMapping("/name/{name}")
    public CombinedResponse getNameInfo(@PathVariable String name) {
        Optional<CombinedResponse> response = combinedResponseRepository.findById(name);
        if (response.isPresent()) {
            return response.get();
        } else {
            return remoteApiTester.fetchNameDetails(name).block();
        }


    }
}
