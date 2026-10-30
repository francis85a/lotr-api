package com.example.client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.example.models.*;

import tools.jackson.databind.JavaType;
import tools.jackson.databind.ObjectMapper;


public class Client {
    
    private static final String BASE = "https://the-one-api.dev/v2";
    private final HttpClient client = HttpClient.newHttpClient();
    private final ObjectMapper mapper = new ObjectMapper();
    private final String token = System.getenv("API_TOKEN");
    /*echo 'export API_TOKEN="tu_token_aqui"' >> ~/.bashrc
    source ~/.bashrc */
    

    private String get(String ruta) throws Exception {

        if (token == null) {
            throw new IllegalStateException("Falta el API_TOKEN");
        }

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE + ruta))
                .header("Authorization", "Bearer " + token)
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new RuntimeException("Error " + response.statusCode() + ": " + response.body());
        }
        return response.body();
    }


    private <T> List<T> listar(String ruta, Class<T> tipo) throws Exception {
    String json = get(ruta);
    JavaType tipoRespuesta = mapper.getTypeFactory()
            .constructParametricType(Response.class, tipo);
    Response<T> respuesta = mapper.readValue(json, tipoRespuesta);
    return respuesta.getDocs();
    }

    public List<LotrCharacter> getCharacters() throws Exception {
        return listar("/character", LotrCharacter.class);
    }

    public List<Movie> getMovies() throws Exception {
        return listar("/movie", Movie.class);
    }

    public List<Quote> getQuotes() throws Exception {
        return listar("/quote", Quote.class);
    }

    public List<Book> getBooks() throws Exception {
        return listar("/book", Book.class);
    }

    public List<Chapter> getChapters() throws Exception {
        return listar("/chapter", Chapter.class);
    }

}
