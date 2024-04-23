package vn.tvn.operators;

public class ArithmeticOperator {

    // +, -, *, /, %

    public void demoArithmeticOperator(){
        int a = 10;
        int b = 20;
        int sum = a + b;  //sum ==> 30
        int sub = a - b;  // sub ==> -10
        int mul = a * b;  // mul ==> 200

        int div = 25 / a;  // div = 2;
        int percent = 25 % a; // per ==> 5  ( lay so du)

    }
    //BT: cho 1 số trong khoảng 0 --100.
    // Tính tổng các số của số đó.
    // ex: 99 --> 9 + 9 = 18;
    // viet method? 10p
    public static int getSumAllNumber(int number){
        int firstNumber = number % 10;
        int remainingNumber = number / 10;
        int secondNumber = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdNumber = remainingNumber % 10;
        return firstNumber + secondNumber + thirdNumber;
    }

    public static void main(String[] args) {
        int result = getSumAllNumber(55);
        System.out.println(result);
        float a = 10;
        float b = 3;
        float c = a / b;
        System.out.println(c);
    }
}
