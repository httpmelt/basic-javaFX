package ku.cs.models;

public class Student {
    private String id;
    private String name;
    private double score;

    // 1st Constructor
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        score = 0;
    }

    // 2nd Constructor
    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void changeName(String name) {
        if (!name.trim().equals("")) {
            this.name = name.trim();
        }
    }

    public void addScore(double score) {
        if (score > 0) {
            this.score += score;
        }
    }

    // TODO: design grading system for Student
    public String grade()
    {
        if (score >= 80) {
            return "A";
        }else if (score >= 75) {
            return "B+";
        }else if (score >= 70) {
            return "B";
        }else if (score >= 65) {
            return "C+";
        }else if (score >= 60) {
            return "C";
        }else if (score >= 55) {
            return "D+";
        }else if (score >= 50) {
            return "D";
        }else{
            return "F";
        }
    }

    public boolean isId(String id) {
        return this.id.equals(id);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "{" +
                "id: '" + id + '\'' +
                ", name: '" + name + '\'' +
                ", score: " + score +
                '}';
    }
}