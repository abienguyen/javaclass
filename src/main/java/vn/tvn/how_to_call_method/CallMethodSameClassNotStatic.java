package vn.tvn.how_to_call_method;

public class CallMethodSameClassNotStatic {


    public static void main(String[] args) {
        CallMethodSameClassNotStatic callMethodSameClassNotStatic
                = new CallMethodSameClassNotStatic();
        callMethodSameClassNotStatic.callIntroducedMethod();
    }



    public void callIntroducedMethod(){
        System.out.println("Hello");
        introduce();
    }


    //method <=> function
    public void introduce(){
        System.out.println("Thinh");
        System.out.println("JavaK30");
    }
}
