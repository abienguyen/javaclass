package vn.tvn.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BT6_1 {
    //Viết function để đảo ngược thứ
    // tự vị trí các giá trị trong 1 ArrayList<String>
    //Ex: ["volvo", "BMW", "Toyota", Mzada"]
            //==> out put
        //["Mzada", "Toyota", "BMW","volvo"]
    //10p

    public ArrayList<String> reverse(ArrayList<String> firstList){
        Collections.reverse(firstList);
        return firstList;
    }

    public ArrayList<String> reverse2(ArrayList<String> firstList){
        ArrayList<String> result = new ArrayList<String>();
        int initial = firstList.size() -1;
        for (int i = initial; i >=0; i--){
            result.add(firstList.get(i));
        }
        return result;
    }


    public static void main(String[] args) {
        BT6_1 bt6_1 = new BT6_1();
        ArrayList<String> arrayList = new ArrayList<>(
                Arrays.asList("volvo", "BMW", "Toyota", "Mzada")
        );
        //bt6_1.reverse(arrayList);
        var a = bt6_1.reverse2(arrayList);
        System.out.println("done");
    }
}
