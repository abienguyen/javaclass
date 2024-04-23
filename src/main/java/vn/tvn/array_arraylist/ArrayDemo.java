package vn.tvn.array_arraylist;

import vn.tvn.practice.bt_4.Student;

public class ArrayDemo {

    public void initialize(){
        //synx
        String[] carNames = new String[5];
        int[] numbers = new int[3];
        Student[] students = new Student[4];
        // fix length

        // set/add/update data in array
        carNames[0] = "Volvo";
        carNames[1] = "BMW";
        carNames[0] = "Volvo2";
        carNames[0] = null;

        //
        String[] cars = {"Volvo", "BMW", "Ford"};

        // get
        String name = cars[0];

    }

    public static void main(String[] args) {
        String a = "toi do hoc";
        var items = a.split(" ");
        ArrayDemo arrayDemo = new ArrayDemo();
        arrayDemo.initialize();
    }

}
