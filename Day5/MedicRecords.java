import java.util.Scanner;

class MedicalRecord {
    protected int recordId;
    protected String patientName;
    protected String dateOfVisit;
    protected String diagnosis;

    public void inputRecordDetails(Scanner sc) {
        System.out.print("Enter Record ID: ");
        recordId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        patientName = sc.nextLine();

        System.out.print("Enter Date of Visit (dd-mm-yyyy): ");
        dateOfVisit = sc.nextLine();

        System.out.print("Enter Diagnosis: ");
        diagnosis = sc.nextLine();
    }

    public void displayRecord() {
        System.out.println("-------- Medical Record --------");
        System.out.printf("%-20s: %d\n", "Record ID", recordId);
        System.out.printf("%-20s: %s\n", "Patient Name", patientName);
        System.out.printf("%-20s: %s\n", "Date of Visit", dateOfVisit);
        System.out.printf("%-20s: %s\n", "Diagnosis", diagnosis);
    }
}

class InPatientRecord extends MedicalRecord {
    private int roomNumber;
    private int numberOfDaysAdmitted;
    private double roomCharges;

    public void inputInPatientDetails(Scanner sc) {
        inputRecordDetails(sc);

        System.out.print("Enter Room Number: ");
        roomNumber = sc.nextInt();

        System.out.print("Enter Number of Days Admitted: ");
        numberOfDaysAdmitted = sc.nextInt();

        System.out.print("Enter Room Charges per Day: ");
        roomCharges = sc.nextDouble();
    }

    public double calculateTotalCharges() {
        return numberOfDaysAdmitted * roomCharges;
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.printf("%-20s: %d\n", "Room Number", roomNumber);
        System.out.printf("%-20s: %d\n", "Days Admitted", numberOfDaysAdmitted);
        System.out.printf("%-20s: $%.2f\n", "Room Charges/Day", roomCharges);
        System.out.printf("%-20s: $%.2f\n", "Total Charges", calculateTotalCharges());
    }
}

class OutPatientRecord extends MedicalRecord {
    private String doctorName;
    private double consultationFee;

    public void inputOutPatientDetails(Scanner sc) {
        inputRecordDetails(sc);

        System.out.print("Enter Doctor Name: ");
        doctorName = sc.nextLine();

        System.out.print("Enter Consultation Fee: ");
        consultationFee = sc.nextDouble();
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.printf("%-20s: %s\n", "Doctor Name", doctorName);
        System.out.printf("%-20s: $%.2f\n", "Consultation Fee", consultationFee);
    }
}



public class MedicRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Record Type:");
        System.out.println("1. In-Patient");
        System.out.println("2. Out-Patient");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            InPatientRecord inPatient = new InPatientRecord();
            inPatient.inputInPatientDetails(sc);
            System.out.println("\n=== In-Patient Record ===");
            inPatient.displayRecord();
        } else if (choice == 2) {
            OutPatientRecord outPatient = new OutPatientRecord();
            outPatient.inputOutPatientDetails(sc);
            System.out.println("\n=== Out-Patient Record ===");
            outPatient.displayRecord();
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
