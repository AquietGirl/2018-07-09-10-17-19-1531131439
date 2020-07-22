package practice07;

public class Klass {
    private int classNumber;

    public Klass(int classNumber) {
        this.classNumber = classNumber;
    }

    public int getNumber() {
        return classNumber;
    }

    public String getDisplayName() {
        return "Class " + classNumber;
    }

}
