package com.github.mirospanacek.ares.model;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.github.mirospanacek.ares.model.pojo.Root;

public class AresClient{

    private String server = "https://ares.gov.cz/ekonomicke-subjekty-v-be/rest/"
            + "ekonomicke-subjekty/vyhledat";
    private HttpClient client = HttpClient.newHttpClient();

    public AresClient() {
    }

    public HttpResponse<String> search(String ico) throws IOException,
            InterruptedException, URISyntaxException {
        
        return client.send(setRequest(ico),
                HttpResponse.BodyHandlers.ofString());
    }

    public Root getResult(HttpResponse<String> response) {

        return new Root();
    }

    public HttpRequest setRequest(String ico) throws URISyntaxException {
        
       return HttpRequest.newBuilder()
                .uri(new URI(server))
                .headers("accept", "application/json", "Content-Type",
                        "application/json")
                .POST(HttpRequest.BodyPublishers
                        .ofString(requestBodyBuilder(ico)))
                .build();
        
    }
    
    public String requestBodyBuilder(String ico) {
        return """
                {
                "start": 0,
                "pocet": 1,
                "razeni": [
                  "ico"
                ],
                "ico": [
                  "%s"
                ]
              }
          """.formatted(ico);
    }
}
