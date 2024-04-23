package vn.tvn.class_object;

public class DemoObject {

    public static void main(String[] args) {

        Student.methodStatic();

        Student thinh = new Student("Thinh");
        Student thanh = new Student("Thanh", "09094893");

        thinh.publicField = "test";

        System.out.println(thanh.publicField);

        // lay name trong object thinh
        var name  = thinh.getName();
        System.out.println(name);

        // update thong tin
        thinh.setPhone("0934003156");
        //thinh.setAddress("16 AU co");
        thinh.setClazz("Java for tester");


        System.out.println(thanh);
//        thanh.printInfo();
        //thinh.printInfo();

        Address anAddress = new Address("16 Auco",
                "Tan Thanh", "Tan Phu", "HCM");

        Student anFullInfo = new Student("An An",
                "java", "0938838", anAddress);

        anFullInfo.printInfo();

        System.out.println("DONE");
    }

}
