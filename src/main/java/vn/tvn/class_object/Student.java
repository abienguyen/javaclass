package vn.tvn.class_object;

import org.apache.commons.lang3.StringUtils;

public class Student {

    static String staticValue = "a";

    // fields
    private String name;
    private String clazz;
    private String phone;
    private Address address;
    public String publicField;

    // constructor
    // 1 or nhieu
    public Student(String name) {
        this.name = name;
    }

    public Student (String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public Student(String name, String clazz,
                   String phone, Address address) {
        this.name = name;
        this.clazz = clazz;
        this.phone = phone;
        this.address = address;
    }

    // methods
    public void printInfo(){
        System.out.println("name: " + name);
        System.out.println("clazz: " + clazz);
        System.out.println("phone: "+phone);
        address.printInfo();
    }

    public String getName(){
        if (StringUtils.equals(name, "Thinh")){
            return "hidden";
        }
        return name;
    }

    public String getClazz() {
        return clazz;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setPhone(String phone){
        if (!(phone.length() == 10)) {
            throw new IllegalArgumentException("invalid phone");
        }
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static void methodStatic() {
        System.out.println("call static");
    }

    // tai sao phair dungf getter, setter


}
