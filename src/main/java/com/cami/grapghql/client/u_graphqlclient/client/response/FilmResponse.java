package com.cami.grapghql.client.u_graphqlclient.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmResponse {

    private String title;
    private String director;
    private String releaseDate;

}
