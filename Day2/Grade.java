
/*Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”*/

public class Grade {
    // Instance variables
    private String studName;
    private int tamil;
    private int english;
    private int maths;
    private int science;
    private int social;
    private double Total = 0;
    private double average = 0;


    public Grade(String studName,int tamil, int english,int maths,int science,int social) {
        this.studName = studName;
        this.tamil = tamil;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.social = social;
    }

    // Method to display students marks.
    public void dispalayMarks() {
        Total = tamil+english+maths+science+social;
        average = Total / 5;
        System.out.println("Name of the Student: " + studName);
        System.out.println("Tamil  : " + tamil);
        System.out.println("English: " + english);
        System.out.println("Maths: " + maths);
        System.out.println("Science: " + science);
        System.out.println("Social : " + social);
        System.out.println("Average:"+ average);
        System.out.println();
    }


    public static void main(String[] args) {
        Grade student1 = new Grade("Jayaram",66,45,34,56,75);
        student1.dispalayMarks();
    }
}
