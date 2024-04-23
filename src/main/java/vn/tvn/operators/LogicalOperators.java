package vn.tvn.operators;

public class LogicalOperators {
    // && (and) , || (or) , !(ngược lại)  ==> true/ false

    public void demoLogicalOperators(){
        int a = 40;
        int b = 20;
        int c = 30;

        boolean result = (a > b) && (a > c);  // ==> false;
        // tất cả biểu thức true ==> kết quả là true
        // chỉ cần 1 biểu thức false thì stop check và kết qua false;

        boolean result2 = (a < b) || (a > c) || (c > b);
        //                  false     true
        // ==> true
        // chỉ cần 1 biểu thức true thì stop --> return true.
        // tất cả biểu thức flase thì --> return false

        boolean result3 = !(a < b);
        //                ! false
        //                  true

        boolean result4 = !result2;  // ===> false
    }

    // BT: Kiem tra 1 employee có được đóng thuế hay ko?
    // Đk1 để được đóng thuế: salary > 300
    // Đk2: location: HCM, HN
    // Nếu employee là nhà có công CM thì đc miễn
    // 10 phút
    // là nhà có công CM  ==> true/ false

    public static boolean hasNoTax(float salary, String location,
                                   boolean isContributed) {
        return (isContributed)
                || (salary > 300
                    && (location.equals("HCM") || location.equals("HN")));
    }

    public static boolean hasTax(float salary, String location, boolean isContributed){
        return !((isContributed)
                || (salary > 300
                && (location.equals("HCM") || location.equals("HN"))));
    }


    public static void main(String[] args) {
        boolean result = hasTax(600, "HCM", true);
        System.out.println(result);

        boolean result2 = hasNoTax(600, "HCM", false);
        System.out.println(result2);

        boolean result3 = hasNoTax(600, "DN", false);
        System.out.println(result3);

        boolean result4 = hasNoTax(200, "HN", false);
        System.out.println(result4);
    }

}
