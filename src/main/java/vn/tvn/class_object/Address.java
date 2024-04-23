package vn.tvn.class_object;

public class Address {
    private String add;
    private String ward;
    private String district;
    private String city;

    public Address(String add, String ward,
                   String district, String city) {
        this.add = add;
        this.ward = ward;
        this.district = district;
        this.city = city;
    }

    public void printInfo(){
        System.out.println("====" +add);
        System.out.println("====" +ward);
        System.out.println("====" +district);
        System.out.println("====" +city);
    }
}
