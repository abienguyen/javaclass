package vn.tvn.extending;

import java.time.LocalDate;

public class Student extends Person {

//    private String name;
//    private String address;
//    private LocalDate birthday;
//    private String phone;
    private String clasz;

    public Student(String name, String address,
                   LocalDate birthday, String phone, String clasz) {
        super(name, address, birthday, phone);
        this.clasz = clasz;
    }

    public void getInfo(){
        printInfo();
        System.out.println(clasz);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(clasz);
    }


}
