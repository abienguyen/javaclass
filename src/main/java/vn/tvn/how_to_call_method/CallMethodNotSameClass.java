package vn.tvn.how_to_call_method;

public class CallMethodNotSameClass {

    public static void main(String[] args) {
        callIntroducedMethod();
        DefautMethod.introduceStatic();
    }


    public static void callIntroducedMethod(){
        System.out.println("Hello");
        DefautMethod defautMethod = new DefautMethod();
        defautMethod.introduce();
    }
}
