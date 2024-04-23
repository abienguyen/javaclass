package vn.tvn.operators;

public class ConditionalOperators {
    // ? :
    // (biểu thức) ? giá trị 1 : giá trị 2

    public static void demoConditionalOperators(){
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println(max);
    }

    public static void main(String[] args) {
        demoConditionalOperators();
    }

    // viet method lay gia tri max cua 2 so, (3soo)
    //
    public int getMaxValue(int a, int b){
        return (a > b) ? a : b;
    }
}
