package com.cami.grapghql.client.u_graphqlclient.client.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class GraphqlRestRequest {

    private String query;

    private Map<String, ? extends Object> variables;
}
