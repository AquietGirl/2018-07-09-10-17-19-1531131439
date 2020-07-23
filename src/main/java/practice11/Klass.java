package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Klass extends Observable {
    private int classNumber;
    private Student leader;
    private List<Student> studentList = new ArrayList<>();
    protected List<Teacher> teacherList = new ArrayList<>();

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
            for (Teacher teacher: teacherList) {

                System.out.print("I am "+teacher.getName()+". I know "+student.getName()+" become Leader of Class "+this.getNumber()+".\n");
            }
            return;
        }
        System.out.print("It is not one of us.\n");
//        System.out.print("I am Tom. I know Jerry become Leader of Class 2.\n");
    }

    public Student getLeader() {
        return this.leader;
    }

 // Jerry old class : 3
    // Jerry new class : 2
    public void appendMember(Student student) {
        if (student != null){
            this.studentList.add(student);
//            System.out.println(student.getKlass().getNumber());
           student.getKlass().setClassNumber(this.getNumber());
            for(Teacher teacher: teacherList ){
                System.out.print("I am " + teacher.getName() + ". I know " + student.getName() + " has joined Class " + this.getNumber() + ".\n");
//                teacher.update();
            }
        }
    }

    public Boolean isInClass(Student student) {
        if (student.getKlass() != null && this.classNumber == student.getKlass().getNumber()) {
            return true;
        }
        return false;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }
}
