package org.team4.repositories;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class NasaDataRepository {

    public String apiKey;

    public void getAPIResponse() throws RuntimeException {
        String apiUri = "https://api.nasa.gov/neo/rest/v1/neo/browse?api_key=" + apiKey;

        try {
            HttpRequest getRequest = HttpRequest.newBuilder()
                    .uri(new URI(apiUri))
                    .header("Authorization", apiKey).build();

            HttpClient httpClient = HttpClient.newHttpClient();

            HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

            httpClient.close();

            System.out.println(getResponse.body());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public NasaDataRepository(String apiKey) {
        this.apiKey = apiKey;
    }
}


