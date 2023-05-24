public class Dancer {
    private String dancerName;
    private char gender;

    public Dancer(String dancerName, char gender) {
        this.dancerName = dancerName;
        this.gender = gender;
    }

    public void setDancer(String dancerName) {
        this.dancerName = dancerName;
    }

    public String getDancerName() {
        return dancerName;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Dancer Name: " + dancerName + "\nGender: " + gender;
    }
}
