package com.sakthivel.spring.samplesoapservice.service;

import com.sakthivel.spring.soap.api.test.TestRequest;
import com.sakthivel.spring.soap.api.test.TestResponse;

public interface TestService {
    public TestResponse testCandidate(TestRequest testRequest);
}
