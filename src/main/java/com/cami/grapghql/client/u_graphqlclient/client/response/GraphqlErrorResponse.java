package com.cami.grapghql.client.u_graphqlclient.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class GraphqlErrorResponse {

    private String message;
    private String path;
    private List<Location> locations;


    @Getter
    @Setter
    public static class Location {
        private int line;
        private int column;
    }
}
