package practice04;

public class Student extends Person{

    private int classNumber;

    public Student(String name, int age, int className) {
        super(name, age);
        this.classNumber = className;
    }

    public int getKlass() {
        return this.classNumber;
    }

    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + this.classNumber + ".";
    }
}
