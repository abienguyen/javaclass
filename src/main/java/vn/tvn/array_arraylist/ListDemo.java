package vn.tvn.array_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public void initialize(){

        List<String> carNames = new ArrayList<>();
        carNames.add("volvo");

        List<String> cars = new ArrayList<>(
                List.of("Volvo", "BMW", "Ford")
        );
    }
}
