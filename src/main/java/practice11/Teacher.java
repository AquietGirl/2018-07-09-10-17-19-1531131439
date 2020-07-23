package practice11;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

public class Teacher extends Person  {
    private LinkedList<Klass> classes = new LinkedList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
//        for (Klass klass : classes) {
//            klass.addObserver(this);
//        }
        for(Klass klass : classes){
            klass.teacherList.add(this);
        }
    }

    public LinkedList<Klass> getClasses() {
        return this.classes;
    }

    public String introduce() {
        if (this.classes.size() != 0) {
            String classNums = "";
            for (int i = 0; i < classes.size(); i++) {
                if (i == classes.size() - 1){
                    classNums += classes.get(i).getNumber();
                    break;
                }
                classNums += classes.get(i).getNumber() + ", ";
            }
            return super.introduce() + " I am a Teacher. I teach Class " + classNums + ".";
        }
        return super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        if (this.classes.size() != 0 && isTeaching(student)) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public Boolean isTeaching(Student student) {
        Boolean isTeaching = false;
        for (Klass klass: classes) {
            if (klass.isInClass(student)){
                isTeaching = true;
            }
        }
        return isTeaching;
    }

//    @Override
    public void update(Observable o, Object arg) {
        String tip = (String) arg;
        System.out.print("I am " + this.getName() + ". " + tip);
    }
}
