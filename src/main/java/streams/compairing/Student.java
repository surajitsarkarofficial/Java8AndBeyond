package streams.compairing;

public class Student {

    private String name;
    private int score;
    private int height;
    Student(String name,int score, int height)
    {
        this.name=name;
        this.score=score;
        this.height=height;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", height=" + height +
                '}';
    }
}
