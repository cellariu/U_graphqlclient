package com.cami.grapghql.client.u_graphqlclient.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanetResponse {

    private String name;
    private List<String> climates;
    private List<String> terrains;
}
