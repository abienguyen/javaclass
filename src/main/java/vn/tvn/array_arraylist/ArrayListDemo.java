package vn.tvn.array_arraylist;

import vn.tvn.practice.bt_4.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

    public void initialize(){

        ArrayList<String> carNames = new ArrayList<>();
        ArrayList<Integer> cardIds = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        // auto incr size khi add new item

        // add new
        carNames.add("volvo");
        carNames.add("BMW");
        // set
        carNames.set(0, "Toyota");
        //remove
        carNames.remove("Toyota");

        ArrayList<String> cars = new ArrayList<>(
                Arrays.asList("Volvo", "BMW", "Ford")
        );

        // lay data trong array
        String name = cars.get(1); //==> BMW

        var sublist = cars.subList(1, 2); // ==> "BMW", "Ford"

        // tao ra object moi
        cars.clone();
    }

    public void demoObjectAtributes(){
        int a = 10;
        int b = a;
        a = a + 10;
        System.out.println(a);
        System.out.println(b);

        ArrayList<String> cars = new ArrayList<>(
                Arrays.asList("Volvo", "BMW", "Ford")
        );

        ArrayList<String> cars2 = (ArrayList<String>) cars.clone();

        cars.add("Toyota");

        System.out.println(cars);
        System.out.println(cars2);


    }

    public static void main(String[] args) {
        ArrayListDemo arrayListDemo = new ArrayListDemo();
        arrayListDemo.initialize();
        arrayListDemo.demoObjectAtributes();
        ArrayList<Integer> arrayList = new ArrayList<>(
                Arrays.asList(1, 5, 6, 2, 7)
        );
        var old = arrayListDemo.getOldArrayList(arrayList);
        System.out.println(old);
        var sum = arrayListDemo.getSumArray(arrayList);
        System.out.println(sum);
    }

    //BT: co arrayList int (chan, le)
    // --> viet method tra ve arrayList toan so le
    // 10p
    public ArrayList<Integer> getOldArrayList(ArrayList<Integer> array) {
        ArrayList<Integer> oldArrayList = new ArrayList<>();
        for (int a : array){
            if (a % 2 != 0){
                oldArrayList.add(a);
            }
        }
        return oldArrayList;
    }

    //BT: co arrayList int ==> tinh tong cua array do
    // 5p
    public int getSumArray(ArrayList<Integer> arrayList){
        int sum = 0;
        for (int number : arrayList){
            sum = sum + number;
        }
        return sum;
    }

}
