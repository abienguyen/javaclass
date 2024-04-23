package vn.tvn.api.user;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import vn.tvn.api.APIUtils;
import vn.tvn.api.User;

import java.util.ArrayList;
import java.util.List;

public class ApiUserTest {

    private static APIUtils apiUtils = new APIUtils();
    static List<User> listUser = new ArrayList<>();

    //https://jsonplaceholder.typicode.com/users

    @BeforeClass
    public static void getInfoApi(){
        var usersString = apiUtils.get("https://jsonplaceholder.typicode.com/users");
        listUser = apiUtils.convertString2Object(usersString);
    }

    @Test
    public void testUser1(){
        Assert.assertEquals(10, listUser.size());
        var u1 = listUser.get(0);
        Assert.assertEquals("Leanne Graham", u1.getName());
        Assert.assertEquals("Sincere@april.biz", u1.getEmail());
    }


    @Test
    public void testUser2(){
        Assert.assertEquals(10, listUser.size());
        var u2 = listUser.get(1);
        Assert.assertEquals("Ervin Howell", u2.getName());
        Assert.assertEquals("Shanna@melissa.tv", u2.getEmail());
    }

}
