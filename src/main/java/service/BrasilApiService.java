package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import modelos.Banco;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BrasilApiService {
    public Banco buscarBanco(String banco) {
        try {
            String url = "https://brasilapi.com.br/api/banks/v1/" + banco;

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            Gson gson = new GsonBuilder().create();
            return gson.fromJson(json, Banco.class);

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao chamar a API");
        }

        return null;
    }
}
