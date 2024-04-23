package vn.tvn.practice.bt_4;

public class DemoBt4 {

    public static void main(String[] args) {
        Clazz java = new Clazz("Java4Test",
                "123 Conh hoa", "IT");
        Score thinhScore = new Score((byte)12, (byte)13, (byte)14);

        Student thinh = new Student("001", "Thinh Tran",
                java, thinhScore, "13/01/1984");

//4.2 Dựa theo 4.1 viết 1 method
// để trả về điểm trung bình của sinh viên

        var avgThinh = thinh.getScore().getAverage();
        var avg2 = thinh.getAvgScore();
        var rank = thinh.getRank();
        var rank2 = thinh.getRank2();

    }

//    Xếp loại của 1 sinh viên theo logic bên dưới
//- Below =20 - F
//-  20 to below 40 - E
//-  40 to below 50 - D
//- 50 to below 60 - C
//- 60 to below 80 - B
//- 80 and above 80 - A





}
