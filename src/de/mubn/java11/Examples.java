package de.mubn.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Examples {

    public static void main(String[] args)  throws IOException, InterruptedException {

        System.out.println("new String Methods:");
        demoNewStringMethods();

        System.out.println("Java HTTP Client:");
        demoHttpClient();

    }

    private static void demoHttpClient() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpRequest request =
                HttpRequest.newBuilder()
                        .uri(URI.create("https://www.google.com/"))
                        .GET()
                        .build();

        HttpResponse<String> response =
                httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }

    private static void demoNewStringMethods() {
        System.out.println("".isBlank()); // -> false
        System.out.println("Each\nline\ncounts".lines().toList()); // -> Stream
        System.out.println("   we messed it up  ".strip()); // -> "we messed it up"

        System.out.println("Hello".repeat(5));
    }
}
