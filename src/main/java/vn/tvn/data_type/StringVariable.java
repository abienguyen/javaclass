package vn.tvn.data_type;


import java.time.LocalDate;

public class StringVariable {
    // String chuỗi data;

    public void innit(){
        // direct way
        String name = "Thinh Tran";
        String name3 = "Thinh Tran";

        // constructor
        String name2 = new String("Thinh Tran");
    }

    // some method String support

    public static void someMethod(){
        // length
        // muốn tìm độ dài cua chuỗi
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed tristique metus non finibus convallis. Donec quis risus et erat aliquet varius. Vivamus sed nulla eget felis auctor imperdiet ultricies eu urna.";
        int len = text.length();
        System.out.println(len);

        // muốn nối 2 chuỗi lại
        String text2 = "hello ";
        String text3 = "Thinh";

        // using + operator
        String full =  text2 + text3;
        // using concat
        String fullText =  text2.concat(text3);
        System.out.println(fullText);

        // format
        // Đơn hàng xxxxxx có giá trị yyyyyy.
        String alert  = "Đơn hàng %s có giá trị %d đươc giao vào ngày %tD";
        LocalDate localDate = LocalDate.now();
        String fullAlert = String.format(alert, "1213131", 120495, localDate);
        System.out.println(fullAlert);

        // cat chuooi
        String subtext = text.substring(0, 10);
        System.out.println(subtext);

        //
        String replaceString = text.replace("o", "0");
        System.out.println(replaceString);

    }

    public static void compareString(String location){
        boolean a = location == "HN"; // ko nen dung

        boolean b = location.equals("HN"); // phai dung
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        //someMethod();
        String valueString = new String("HN");
        compareString(valueString);
    }


}
