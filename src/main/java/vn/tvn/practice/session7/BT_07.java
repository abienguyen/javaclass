package vn.tvn.practice.session7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

import java.util.*;

public class BT_07 extends APIUtils {
    /*
    There is API: https://jsonplaceholder.typicode.com/users
    a. Write a Java function read the info of the API above.
    (Some fields: id, name, username, email, address.street)
    + google keyword search: How to send HTTP request GET/POST
     in Java
    Ex: https://mkyong.com/java/how-to-send-http-request-getpost-in-java/
     */

    public String getUsers(){
        String url = "https://jsonplaceholder.typicode.com/users";
        String result = get(url);
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        BT_07 bt_07 = new BT_07();
        var usersString = bt_07.getUsers();
        var users = convertString2Object(usersString);

        System.out.println("Done");
    }

    public static List<User> convertString2Object(String string){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            var users = objectMapper.readValue(string, new TypeReference<List<User>>(){});
            return users;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void convert2ObjectViaJsonPath(String usersString){
        var context = JsonPath.parse(usersString);
        List<LinkedHashMap<String, Object>> listUser = context.read("$[*]");
        List<User> result = new ArrayList<>();
        for (LinkedHashMap<String, Object> user : listUser){
            Integer id = (Integer) user.get("id");
            String name = (String) user.get("name");
            //result.add(new User(id, name, "", ""));
        }
    }

}
