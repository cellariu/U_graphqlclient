package com.cami.grapghql.client.u_graphqlclient.client;

import com.cami.grapghql.client.u_graphqlclient.client.request.GraphqlRestRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class StarwarsRestClient {

    private static final String URL = "https://swapi-graphql.netlify.app/.netlify/functions/index";

    private RestTemplate restTemplate = new RestTemplate();

//    private ObjectMapper objectMapper = new ObjectMapper();

    public String asJson(GraphqlRestRequest body, Map<String, List<String>> headersMap) {

        var requestHeaders = new HttpHeaders();

        if (headersMap != null) {
            headersMap.forEach(requestHeaders::addAll);
        }

        ResponseEntity<String> responseEntity =
                restTemplate.postForEntity(URL, new HttpEntity(body, requestHeaders), String.class);

        return responseEntity.getBody();
    }

}
