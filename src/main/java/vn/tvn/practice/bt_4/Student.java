package vn.tvn.practice.bt_4;

public class Student {
    private String id;
    private String name;
    private Clazz clazz;
    private Score score;
    private String birthday;

    public Student(String id, String name,
                   Clazz clazz, Score score, String birthday) {
        this.id = id;
        this.name = name;
        this.clazz = clazz;
        this.score = score;
        this.birthday = birthday;
    }

    public Score getScore() {
        return score;
    }

    public String getId() {
        return id;
    }

    public byte getAvgScore(){
        return score.getAverage();
    }

    public String getRank(){
        var avg = getAvgScore();
        if (avg >= 80){
            return "A";
        } else if(avg >= 60){
            return "B";
        } else if (avg >= 50){
            return "C";
        } else if (avg >= 40){
            return "D";
        } else if (avg >= 20){
            return "E";
        } else {
            return "F";
        }
    }

    public String getRank2(){
        var avg = getAvgScore();
        var rank = avg / 10;
        switch (rank){
            case 10:
            case 9:
            case 8:
                return "A";
            case 7:
            case 6:
                return "B";
            case 5:
                return "C";
            case 4:
                return "D";
            case 3:
            case 2:
                return "E";
            default:
                return "F";
        }
    }

    public void print() {

    }

    //    public static class Clazz{
//
//    }
}
