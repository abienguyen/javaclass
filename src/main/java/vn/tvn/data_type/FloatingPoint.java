package vn.tvn.data_type;

public class FloatingPoint {

    public static void init(){

        float a = (float)15.3;
        float b = 14.3f;

        double d = 111.22;

        double result = Double.parseDouble("131313");
        double c = Double.min(a, b);

        Double dObject = 100.00;
        dObject.byteValue();

        String s = Float.toString(b);

        System.out.println(c);

        // input String
        // output double

    }

    public static void main(String[] args) {
        init();
    }


    // Bai tap: 10ph
    // write method tinh dt hinh chu nhat khi cos dai & rong?

    public void getDienTichHinhChuNhat(){
        float dai = 23.5f;
        float rong = 10.5f;
        float s = dai * rong;
    }

}
