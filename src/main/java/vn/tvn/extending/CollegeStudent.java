package vn.tvn.extending;

import java.time.LocalDate;

public class CollegeStudent extends Student {
    private String collegeId;

    public CollegeStudent(String name, String address,
                          LocalDate birthday, String phone,
                          String clasz, String collegeId) {
        super(name, address, birthday, phone, clasz);
        this.collegeId = collegeId;
    }

}
