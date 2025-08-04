/*6. Write a program that would print the information (name, year of joining, salary, address) of three employees 
by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output. */
class empFormat {
    String name;
    int year;
    String address;

    empFormat(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }

    void display() {
        System.out.printf("%-10s %-18d %-20s\n", name, year, address);
    }

    public static void main(String[] args) {
        empFormat e1 = new empFormat("Jayaram", 1994, "64C- WallsStreat");
        empFormat e2 = new empFormat("Ram", 2000, "68D- WallsStreat");
        empFormat e3 = new empFormat("Jackie", 1999, "26B- WallsStreat");

        System.out.printf("%-10s %-18s %-20s\n", "Name", "Year of Joining", "Address");
        e1.display();
        e2.display();
        e3.display();
    }
}