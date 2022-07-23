package com.testjava11;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Test03Http {
    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(new URI("http://www.baidu.com")).GET().build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}
