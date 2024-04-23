package vn.tvn.class_object;

public class StaticInstanceDemo {

    //instance init
    {
        System.out.println("instance run");
    }
    static {
        System.out.println("Static run");
    }
    //constructor
    public StaticInstanceDemo() {
        System.out.println("constructor run");
    }
    public static void main(String[] args) {
        System.out.println("Main run");
        StaticInstanceDemo con = new StaticInstanceDemo();
    }


}
