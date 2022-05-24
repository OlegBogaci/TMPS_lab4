package solid_patterns.liscov_substitution;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new ULIMStudent());
        studentList.add(new UTMStudent());
        studentList.add(new USMFStudent());

        studentList.forEach(Student::study);
        studentList.forEach(x-> System.out.println(x.getAvg()));

    }
}
