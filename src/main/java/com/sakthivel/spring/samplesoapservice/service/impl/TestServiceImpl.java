package com.sakthivel.spring.samplesoapservice.service.impl;

import org.springframework.stereotype.Service;

import com.sakthivel.spring.samplesoapservice.service.TestService;
import com.sakthivel.spring.soap.api.test.TestRequest;
import com.sakthivel.spring.soap.api.test.TestResponse;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public TestResponse testCandidate(TestRequest testRequest) {
        TestResponse response = new TestResponse();
        boolean isEligible = testRequest.getAge() > 18;
        response.setIsEligible(isEligible);
        response.setFor(isEligible ?  "doing anything" : "doing nothing");
        response.getReason().add(isEligible ? "above 18" : "below 18");
        return response;
    }
    
}
