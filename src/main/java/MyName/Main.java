package MyName;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static Gson gson = new Gson();

    public static void main(String[] args) {
        Map<String, String> myName = new HashMap<>();
        myName.put("name", "Denis");
        myName.put("LastName", "Tytarenko");

        String jsonString = gson.toJson(myName);
        System.out.println(jsonString);
    }
}
