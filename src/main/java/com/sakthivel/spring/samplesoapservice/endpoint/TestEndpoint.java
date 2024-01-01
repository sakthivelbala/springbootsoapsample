package com.sakthivel.spring.samplesoapservice.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.sakthivel.spring.samplesoapservice.service.TestService;
import com.sakthivel.spring.soap.api.test.TestRequest;
import com.sakthivel.spring.soap.api.test.TestResponse;

@Endpoint
public class TestEndpoint {

    @Autowired
    private TestService testService;

    private static final String NAMESPACE_URI = "http://www.sakthivel.com/spring/soap/api/test";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "TestRequest")
    @ResponsePayload
    public TestResponse test(@RequestPayload TestRequest testRequest){
        return testService.testCandidate(testRequest);
    }
    
}
