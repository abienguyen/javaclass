package vn.tvn.selection_decisions;


import org.apache.commons.lang3.StringUtils;

public class IfElseDemo {

    public void ifDemo(int a){
        if (a % 2 == 0){
            System.out.println("So chan");
        }
        System.out.println("Done");
    }

    public void ifElseDemo(int a){
        if (a % 2 == 0){
            System.out.println("So chan");
        } else {
            System.out.println("So le");
        }
        System.out.println("Done");
    }

    public void ifAndIfElseDemo(int a, int b){
        if (a % 2 == 0){
            if (b % 2 == 0){
                System.out.println("Ca hai so chan: " + a + ", " + b);
            } else {
                System.out.println("So "+ a +" la chan, so "+b+" la le");
            }
        }
        System.out.println("done");
    }

    public void ladderStatement(int a, int b){
        if (a % 2 == 0){

        } else if (b % 2 != 0){
            System.out.println("Ca hai so le: " + a + ", " + b);
        } else {
            System.out.println("So "+ a +" la le, so "+b+" la chan");
        }
    }

    public void ladderStatement2(int a, int b){
        if (a % 2 == 0){

        } else {
            if (b % 2 != 0){
                System.out.println("Ca hai so le: " + a + ", " + b);
            }
        }
    }


    public static void main(String[] args) {
        IfElseDemo ifElseDemo = new IfElseDemo();
        //ifElseDemo.ifDemo(14);
        //ifElseDemo.ifElseDemo(12);
        //ifElseDemo.ifAndIfElseDemo(15, 5);
        ifElseDemo.ladderStatement(15, 6);
    }

    // BT: Tinh luong thuc nhan cua nhan vien
    // net = gross - tax
    // gross > 3000 --> tax = 30% (anywhere)
    // gross >= 2000 --> location (HN, HCM, DN)
    //             --> tax = 25%, other location tax = 20%
    // gross < 2000 --> location (HN, HCM, DN)
    //    //       --> tax = 15%, other location tax = 5%
    // time 15p
    public double getNetSalary(double gross, String location){
        boolean isBigCity = isBigCity(location);
        double tax = 0;
        if (gross > 3000){
            tax = getTax(gross, 0.3f);
        } else if (gross >= 2000){
            // 2000 --> 3000
            if (isBigCity){
                tax = getTax(gross, 0.25f);
            } else {
                tax = getTax(gross, 0.2f);
            }
        } else {
            // < 2000
            if (isBigCity){
                tax = getTax(gross, 0.15f);
            } else {
                tax = getTax(gross, 0.05f);
            }
        }
        return gross - tax;
    }
    private boolean isBigCity(String location){
         return StringUtils.equals(location, "HCM")
                || StringUtils.equals(location, "HN")
                || StringUtils.equals(location, "DN");
    }

    private double getTax(double gross, float rate){
        return gross * rate;
    }

}
