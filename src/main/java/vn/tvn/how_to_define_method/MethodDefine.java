package vn.tvn.how_to_define_method;

public class MethodDefine {

    // modifier (public, private, protected, default)
    public void methodNoParameterNoReturn(){
        // dung void neu ko muon tra ve gia trij ket qua
        int number1 = 100;
        int number2 = 200;
        int sum = number1 + number2;
        System.out.println(sum);
        System.out.println("methodNoParameterNoReturn");
    }

    public void methodHasParameterAndNoReturn(int number1, int number2){
        int sum = number1 + number2;
        System.out.println(sum);
    }

    public int methodHasParameterAndReturn(int number1, int number2){
        // thay void bang data_tpe maf muon tra veef
        int sum = number1 + number2;
        return sum;
    }


    public static void main(String[] args) {
        MethodDefine methodDefine = new MethodDefine();
        int s = methodDefine.methodHasParameterAndReturn(20, 40);
        System.out.println(s);
    }

}
