import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.Post;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://jsonplaceholder.typicode.com/posts");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        BufferedReader bodyResponse = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        Type typeToCatch = new TypeToken<ArrayList<Post>>(){}.getType();
        String bodyJson = bodyResponse.lines().collect(Collectors.joining());
        List<Post> posts = new Gson().fromJson(bodyJson, typeToCatch);
        //Displays 100 object's references
        posts.stream().forEach(System.out::println);
    }
}
