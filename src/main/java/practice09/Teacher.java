package practice09;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce() {
        if (this.klass != null ){
            return super.introduce() + " I am a Teacher. I teach " + this.klass.getDisplayName() + ".";
        }
        return super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        if (this.klass !=null && student.getKlass().getNumber() == this.klass.getNumber()) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }
}
