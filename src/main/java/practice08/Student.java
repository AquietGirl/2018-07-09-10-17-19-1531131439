package practice08;

public class Student extends Person{
    private Klass klass;
    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce() {
        if (this.klass.getLeader() == this) {
            return super.introduce() + " I am a Student. I am Leader of " + this.klass.getDisplayName() + ".";
        }
        return super.introduce() + " I am a Student. I am at " + this.klass.getDisplayName() + ".";
    }
}
