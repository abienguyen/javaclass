package vn.tvn.extending;

import java.time.LocalDate;

public class Person {

    public String name;
    public String address;
    public LocalDate birthday;
    public String phone;
    int weight = 300; // instance

    public Person(String name, String address,
                  LocalDate birthday, String phone) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.phone = phone;
    }

    public void printInfo(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(birthday);
        System.out.println(phone);
    }

    public void extSub(){

    }
}
