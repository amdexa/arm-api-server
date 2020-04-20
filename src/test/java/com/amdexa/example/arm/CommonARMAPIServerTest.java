package com.amdexa.example.arm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.*;

@Import(AppTestConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class CommonARMAPIServerTest {

    @LocalServerPort
    int randomServerPort;

    @Test
    void bootstrapTest() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI("http://localhost:" + randomServerPort + "/actuator");
        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
        //Verify request succeed
        assertEquals(200, result.getStatusCodeValue());
    }
}