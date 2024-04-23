package vn.tvn.data_type;

public class IntegerVariable {

    public void innit(){

        //byte, short, int, long
        byte age = 40; //(-128 -- 127)
        short age2 = 10; // (32K)
        int age3 = 30;
        long age5 = 40;

        byte compareValue = 40;

        Byte object = Byte.valueOf(age);
        int result = Byte.compare(age, compareValue); // 0 --> bang nhau
        // age - compareValue = result;  ==> <0 age nho hon compareValue
                                        //==> > 0  age lon hon compareValue

        Integer objectInt = 100;


        //BT
        //Byte.
        //object.
    }



}
