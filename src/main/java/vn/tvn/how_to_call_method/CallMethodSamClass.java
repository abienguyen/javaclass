package vn.tvn.how_to_call_method;

public class CallMethodSamClass {


    public static void main(String[] args) {
        callIntroducedMethod();
    }


    public static void callIntroducedMethod(){
        System.out.println("Hello");
        introduce();
    }


    //method <=> function
    public static void introduce(){
        System.out.println("Thinh");
        System.out.println("JavaK30");
    }



}
