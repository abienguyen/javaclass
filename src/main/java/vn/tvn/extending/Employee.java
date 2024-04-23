package vn.tvn.extending;

import java.time.LocalDate;

public class Employee extends Person {

//    private String name;
//    private String address;
//    private LocalDate birthday;
//    private String phone;
    private String job;
    int weight = 200; // instance

    public Employee(String name, String address,
                    LocalDate birthday, String phone, String job) {
        super(name, address, birthday, phone);
        this.job = job;
    }

    public void getInfo(){
        printInfo();
        System.out.println(job);
    }

    public void sameNameVariable(){
        int weight = 100; // --> local
        System.out.println(weight);
        System.out.println(this.weight);
        System.out.println(super.weight);
    }
}
