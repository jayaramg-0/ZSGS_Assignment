class StudentDetailsQ2 {
    String name;
    int roll_no;
    int phone_no;
    String address;

    StudentDetailsQ2(String name, int roll_no, int phone_no, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }

    void display() {
         System.out.println("Student Name: " + name);
         System.out.println("Roll No: " + roll_no);
         System.out.println("Phone: " + phone_no);
         System.out.println("Address: " + address);
         System.out.println();
    }

    public static void main(String[] args) {
        StudentDetailsQ2 s1 = new StudentDetailsQ2("Sam", 1, 1234567890, "New York");
        StudentDetailsQ2 s2 = new StudentDetailsQ2("John", 2, 987654321, "Los Angeles");
        s1.display();
        s2.display();
    }
}