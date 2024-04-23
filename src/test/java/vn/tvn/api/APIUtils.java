package vn.tvn.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

public class APIUtils {

    private final OkHttpClient httpClient = new OkHttpClient();


    public String get(String url){
        Request request = new Request.Builder()
                .url(url)
                .addHeader("token", "....")  // add request headers
                .addHeader("User-Agent", "OkHttp Bot")
                .build();
        try {
            Response response = httpClient
                    .newCall(request)
                    .execute();
            return response.body().string();
        } catch (IOException e) {
            throw new IllegalArgumentException("Error: "
                    + e.getMessage());
        }
    }

    public List<User> convertString2Object(String string){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            var users = objectMapper.readValue(string, new TypeReference<List<User>>(){});
            return users;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
