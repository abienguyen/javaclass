package vn.tvn.loop;

public class DemoForLoop {


    public void demoForI(int a){
        for (int i = 0; i < a; i++){
            System.out.println("So: " + i);
        }
    }

    public void demoForEach(String[] carNames){
        for (String car : carNames){
            System.out.println(car);
        }
    }

    public void demoFor(String[] carNames){
        for(int i = 0; i < carNames.length; i++){
            System.out.println(carNames[i]);
        }
    }


    public static void main(String[] args) {
        DemoForLoop demo = new DemoForLoop();
        demo.demoForI(5);
        String[] cars = {"Mazda", "Toyota", "BMW", "Volvo", "Ford"};
        demo.demoForEach(cars);
        demo.demoFor(cars);
        demo.getOldNumber(9);
    }

    //BT: Cho 1 so n, lay ra cac so le, be hon so n do.
    // 10ph
    public void getOldNumber(int n){
        for (int i = 1; i <= n; i+=2){
            System.out.println(i);
        }
    }

}
