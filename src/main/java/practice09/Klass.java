package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int classNumber;
    private Student leader;
    private List<Student> studentList = new ArrayList<>();

    public Klass (int classNumber) {
        this.classNumber = classNumber;
    }

    public int getNumber() {
        return this.classNumber;
    }

    public String getDisplayName() {
        return "Class " + this.classNumber;
    }

    public void assignLeader(Student student) {
        if (this.studentList != null && this.studentList.contains(student)) {
            this.leader = student;
        }
        System.out.print("It is not one of us.\n");
    }

    public Student getLeader() {
        return this.leader;
    }

    public void appendMember(Student student) {
        if (student != null){
            this.studentList.add(student);
        }
    }
}
