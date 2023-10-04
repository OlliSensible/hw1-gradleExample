import com.google.gson.Gson;

import java.util.Map;

public class MyName {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("name", "Olha", "lastName", "Senchyk");

        Gson gson = new Gson();
        System.out.println(gson.toJson(map));
    }
}