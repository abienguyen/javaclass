package vn.tvn.data_type;


import vn.tvn.practice.bt_4.Clazz;
import vn.tvn.practice.bt_4.Score;
import vn.tvn.practice.bt_4.Student;

import java.util.HashMap;
import java.util.Map;

public class HashMapVariable {

    public void initialize(){
        Map<String, String> cityMap = new HashMap<>();

        Map<Integer, String> demoMap = new HashMap<>();

        Map<String, Student> studentMap = new HashMap<>();

        Clazz java = new Clazz("Java4Test",
                "123 Conh hoa", "IT");
        Score thinhScore = new Score((byte)12, (byte)13, (byte)14);

        Student thinh = new Student("001", "Thinh Tran",
                java, thinhScore, "13/01/1984");
        Student thanh = new Student("002", "Thanh Nguyen",
                java, thinhScore, "13/01/1984");


        // dua data vao map
        studentMap.put(thinh.getId(), thinh);
        studentMap.put(thanh.getId(), thanh);

        cityMap.put("VN", "Viet Nam");
        cityMap.put("EN", "England");
        cityMap.put("JP", "Japan");
        cityMap.put("CN", "China");
        cityMap.put("VN", "VietNam");

        // get data value
        var name = cityMap.get("VN");
        System.out.println(name);

        // ko biet key thif sao maf lay
        // --> lay tap hop key
        var keys = cityMap.keySet();
        for (String key : keys){
            System.out.println(key);
            var value = cityMap.get(key);
            System.out.println(value);
        }

        // --> so luong item
        cityMap.size();

        //lay tap hop values
        var values = cityMap.values();
        for (String value : values){
            System.out.println(value);
        }

        var valueStudents = studentMap.values();
        for (Student student : valueStudents){
            student.print();
        }

        // methods khac vef tim hieu
    }

    public static void main(String[] args) {
        HashMapVariable hashMapVariable = new HashMapVariable();
        hashMapVariable.initialize();
    }

}
