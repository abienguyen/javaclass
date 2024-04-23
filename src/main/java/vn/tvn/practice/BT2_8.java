package vn.tvn.practice;

public class BT2_8 {
    //Viết method replace all
    // số có trong chuỗi đã cho.

    public static String replaceNumber(String text){
        var result =
                text.replaceAll("\\d", "");

        var number = text.length();
        return result;
    }

    public static void main(String[] args) {
        String a = replaceNumber("aaa 2ds 32fss");
        System.out.println(a);
    }

}
