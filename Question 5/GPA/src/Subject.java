public class Subject{
    private String codeSubject;
    private int creditHour;
    private String gred;

    public Subject(String codeSubject, int creditHour, String gred){
        this.codeSubject = codeSubject;
        this.creditHour = creditHour;
        this.gred = gred;
    }

    public String getCodeSubject(){
        return codeSubject;
    }

    public int getCreditHour(){
        return creditHour;
    }

    public String getGred(){
        return gred;
    }

    public String toString(){
        return "Code subject: " + codeSubject + "\nCredit hour: " + creditHour + "\nGred: " + gred;
    }
}