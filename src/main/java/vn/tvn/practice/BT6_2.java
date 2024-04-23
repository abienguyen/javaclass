package vn.tvn.practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class BT6_2 {
    //6.2: Viết method
    // count xem 1 số xuất hiện bao nhiêu lần trong arrayList
    //Ex:  arrayList: = [1,2,3,3,2,4,6,8,3,4,2,2,9]
    //==> output
    //Có 1 số 1
    //Có 4 số 2
    //Có 3 số 3
    //Có 2 số 4
    //.....

    public Map<Integer, Integer> countNumberInArray(ArrayList<Integer> numbers){
        if (Objects.isNull(numbers)){
            return new HashMap<Integer, Integer>();
        }
        Map<Integer, Integer> result = new HashMap<Integer, Integer>();
        for (int number : numbers){
            if (result.containsKey(number)){
                result.put(number, result.get(number) + 1);
            } else {
                result.put(number, 1);
            }
        }
        return result;
    }

    public void countNumberInArray2(ArrayList<Integer> numbers){
        ArrayList<Integer> exist = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++){
            int count = 1;
            if (exist.contains(numbers.get(i))){
                continue;
            } else {
                exist.add(numbers.get(i));
            }
            for (int j = i+1; j < numbers.size(); j++){
                if (numbers.get(i) == numbers.get(j)){
                    count = count + 1;
                }
            }
            var mes = String.format("Co %d so %d",
                    count, numbers.get(i));
            System.out.println(mes);
        }
    }

    public static void main(String[] args) {
        BT6_2 bt6_2 = new BT6_2();
        ArrayList<Integer> array = new ArrayList(
                Arrays.asList(1,2,3,3,2,4,6,8,3,4,2,2,9)
        );
        //ArrayList<Integer> array = null;

        var result = bt6_2.countNumberInArray(array);
        for (int key : result.keySet()){
            var mes = String.format("Co %d so %d", result.get(key), key);
            System.out.println(mes);
        }

       // bt6_2.countNumberInArray2(array);
        bt6_2.getLocationNumber(array, 1);
    }


    // list int & 1 so cho truoc
    // --> tim vi tri dau tien cua so do

    public void getLocationNumber(List<Integer> numbers, int n){
        try {
            for (int i = 0; i < numbers.size(); i++){
                if (numbers.get(i) == n){
                    System.out.println("Vi tri laf: " + i);
                    break;
                }
            }
        } catch (Exception e){
            System.out.println("not null value");
        }
    }

    public int getLocationNumber2(List<Integer> numbers, int n){
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) == n){
                System.out.println("Vi tri laf: " + i);
                return i;
            }
        }
        return -1;
    }


}
