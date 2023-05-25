public class Student {
    private String name;
    private int noMatrix;
    private int part;
    private String course;
    private Subject subject[] = new Subject[7];

    public Student(String name, int noMatrix, int part, String course, Subject subject[]) {
        this.name = name;
        this.noMatrix = noMatrix;
        this.part = part;
        this.course = course;
        for (int i = 0; i < 7; i++) {
            this.subject[i] = subject[i];
        }
    }

    public void setData(String name, int noMatrix, int part, String course, Subject subject[]) {
        this.name = name;
        this.noMatrix = noMatrix;
        this.part = part;
        this.course = course;
        for (int i = 0; i < 7; i++) {
            this.subject[i] = subject[i];
        }
    }

    public double calcGPA() {
        for (int i = 0; i < 7; i++) {
            double GPA = 0.0;
            switch (subject[i].getGred()) {
                case "A":
                    subject[i].setGpa(4.0);
                    GPA = 4.0;
                    break;
                case "A-":
                    subject[i].setGpa(3.67);
                    GPA = 3.67;
                    break;
                case "B+":
                    subject[i].setGpa(3.33);
                    GPA = 3.33;
                    break;
                case "B":
                    subject[i].setGpa(3.0);
                    GPA = 3.0;
                    break;
                case "B-":
                    subject[i].setGpa(2.67);
                    GPA = 2.67;
                    break;
                case "C+":
                    subject[i].setGpa(2.33);
                    GPA = 2.33;
                    break;
                case "C":
                    subject[i].setGpa(2.0);
                    GPA = 2.0;
                    break;
                case "C-":
                    subject[i].setGpa(1.67);
                    GPA = 1.67;
                    break;
                case "D+":
                    subject[i].setGpa(1.33);
                    GPA = 1.33;
                    break;
                case "D":
                    subject[i].setGpa(1.0);
                    GPA = 1.0;
                    break;
                case "E":
                    subject[i].setGpa(0.67);
                    GPA = 0.67;
                    break;
                case "F":
                    subject[i].setGpa(0.0);
                    GPA = 0.0;
                    break;
                default:
                    System.out.println("Invalid gred");
                    break;
            }
        }
        return GPA;
    }

    public String getName() {
        return name;
    }

    public int getNoMatrix() {
        return noMatrix;
    }

    public String getCourse() {
        return course;
    }

    public Subject[] getSubject() {
        return subject;
    }

    public String toString() {
        string allSubject = "";
        for (int i = 0; i < 7; i++) {
            allSubject += subject[i] + "\n";
        }
        return "Name: " + name + "\nNo. Matrix: " + noMatrix + "\nPart: " + part + "\nCourse: " + course + "\nSubject: "
                + allSubject;
    }
}