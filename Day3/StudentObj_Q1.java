/*1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. 
Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student. */
class StudentObj_Q1 {
    String name;
    int roll_no;

    public static void main(String[] args) {
        StudentObj_Q1 s = new StudentObj_Q1();
        s.name = "John";
        s.roll_no = 2;
        System.out.println("Roll No: " + s.roll_no);
        System.out.println("Name: " + s.name);
    }
}