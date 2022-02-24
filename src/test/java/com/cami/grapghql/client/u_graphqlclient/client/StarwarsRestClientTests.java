package com.cami.grapghql.client.u_graphqlclient.client;

import com.cami.grapghql.client.u_graphqlclient.client.request.GraphqlRestRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StarwarsRestClientTests {

    @Autowired
    private StarwarsRestClient client;

    @Test
    void testAsJson() {
        var query = """
                query allPlanets {
                  allPlanets {
                    planets {
                      name
                      climates
                      terrains
                    }
                  }
                }
                """;

        var body = new GraphqlRestRequest();

        body.setQuery(query);

        var result = client.asJson(body, null);

       assertNotNull(result);
    }

    @Test
    void testAsJsonInvalidCall() {
        var query = """
                query allPlanets {
                  allPlanetsxxx {
                    planets {
                      name
                      climates
                      terrains
                    }
                  }
                }
                """;

        var body = new GraphqlRestRequest();

        body.setQuery(query);

        assertThrows(RuntimeException.class, () -> client.asJson(body, null));
    }

}
