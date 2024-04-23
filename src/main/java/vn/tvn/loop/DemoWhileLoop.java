package vn.tvn.loop;

public class DemoWhileLoop {

    public void whileDemo(int n){
        int i = 0;
        while(i < n){
            System.out.println("gia tri: " + i);
            i++;
        }
    }

    public void doWhileDemo(int n){
        int i = 0;
        do {
            System.out.println("gia tri i: " + i);
            i++;
        } while (i < n);
    }


    public static void main(String[] args) {
        DemoWhileLoop demo = new DemoWhileLoop();
        demo.whileDemo(0);
        demo.doWhileDemo(0);
    }

}
