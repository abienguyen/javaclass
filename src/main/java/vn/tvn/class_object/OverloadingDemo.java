package vn.tvn.class_object;

public class OverloadingDemo {

    // overloading constructor

    // Overloading method
    public int add(int n1, int n2){
        return n1 + n2;
    }

    // number of parameter
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    //data type
    public float add(int n1, float n2){
        return n1 + n2;
    }

    public float add(float n1, int n2){
        return n1 + n2;
    }

    public static void main(String[] args) {
        OverloadingDemo demo = new OverloadingDemo();
        demo.add(13, 14f);
        demo.add(12f, 14);
        //demo.add(13, 14, 1, 15, 13, 12);
    }

    public int add(int c, int... number){
        int b = 0;
        for (int a : number){
            b = b + a;
        }
        return b;
    }

}
