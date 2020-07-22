package practice10;

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
        if (isInClass(student)) {
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

    public Boolean isInClass(Student student) {
        if (student.getKlass() != null && this.classNumber == student.getKlass().getNumber()) {
            return true;
        }
        return false;
    }
}
