package practice06;

public class Teacher extends Person{
    private int classNumber;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int classNumber) {
        super(name, age);
        this.classNumber = classNumber;
    }

    public int getKlass() {
        return this.classNumber;
    }

    public String introduce() {
        if (this.classNumber != 0) {
            return super.introduce() + " I am a Teacher. I teach Class " + this.classNumber + ".";
        }
        return super.introduce() + " I am a Teacher. I teach No Class.";
    }
}
