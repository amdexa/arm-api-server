/*
 * Copyright (c) 2020 Amdexa. (https://amdexa.com) All Rights Reserved.
 *
 * Amdexa licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.amdexa.example.arm.service;

import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Value("${auth0.audience}")
    private String audience;

    @Value("${auth0.client_id}")
    private String clientId;

    @Value("${auth0.client_secret}")
    private String clientSecret;

    @Value("${spring.security.oauth2.resourceserver.jwt.issuer-uri}")
    private String issuer;

    @Override
    public String login(String username, String password) {
        RestTemplate loginTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();

        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        formData.add("grant_type", "password");
        formData.add("username", username);
        formData.add("password", password);
        formData.add("audience", audience);
        formData.add("client_id", clientId);
        formData.add("client_secret", clientSecret);
        HttpEntity<MultiValueMap<String, String>> payload = new HttpEntity<>(formData, headers);
        //TODO: properly handle response and errors
        JSONObject response = loginTemplate.exchange(issuer + "oauth/token", HttpMethod.POST, payload, JSONObject.class).getBody();
        return String.format("%s %s", response.getAsString("token_type"), response.getAsString("access_token"));
    }
}
