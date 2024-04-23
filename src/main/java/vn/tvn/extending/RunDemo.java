package vn.tvn.extending;

import javax.crypto.MacSpi;
import java.time.LocalDate;

public class RunDemo {

    public static void main(String[] args) {

        Student student = new Student("Thinh",
                "16 Cong Hoa", LocalDate.now(),
                "0934003156", "Java");

        Employee employee = new Employee("Ha Ha",
                "17 Tan Tan", LocalDate.now(),
                "909090909", "cleaner");

        //student.getInfo();
        student.printInfo();

        CollegeStudent collegeStudent = new CollegeStudent("Han",
                "12 ddd", LocalDate.now(), "099900",
                "java", "10029");


        collegeStudent.getInfo();
        collegeStudent.printInfo();
        collegeStudent.extSub();

        employee.sameNameVariable();
    }

}
