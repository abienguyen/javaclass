package vn.tvn.operators;

public class RelationalOperators {
    // <, <= , >, >=, ==, !=   ==> boolean (true/false)

    public void demoRelationalOperators(){
        int a = 100;
        int b = 100;

        boolean result = a < b;  // --> result = false
        boolean result1 = a <= b; // --> result1 = true

        boolean result2 = a >= b; // --> result2 = true
        boolean result3 = a > b; // --> result3 = false

        boolean result4 = a == b; // --> result4 = true

        // so sanh a khác b hay ko?
        boolean result5 = a != b; // --> result5 = false

    }

    //BT ==>  5p, viết method, kiểm tra 1 số có phải là chẵn ko?
    // ==> return?, parameter?
    public boolean isOldNumber(int a){
        // lay so du
        int per = a % 2;
        //so sanh so du do
        boolean result = per == 0;
        // tra ve ket qua
        return result;
    }

    public static boolean isNewNumber2(int a){
        return a % 2 == 0;
    }

    public static void main(String[] args) {

        System.out.println(isNewNumber2(0));
        System.out.println(isNewNumber2(3));
        System.out.println(isNewNumber2(10));

    }


}
