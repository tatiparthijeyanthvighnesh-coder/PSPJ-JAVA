import java.util.Scanner;

public class ClinicAppointmentManager {

    static Scanner sc = new Scanner(System.in);

    static String patientName;
    static String doctorName;
    static String appointmentDate;
    static String prescription;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== CLINIC APPOINTMENT & PRESCRIPTION MANAGER =====");
            System.out.println("1. Book Appointment");
            System.out.println("2. View Appointment");
            System.out.println("3. Add Prescription");
            System.out.println("4. View Prescription");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    bookAppointment();
                    break;

                case 2:
                    viewAppointment();
                    break;

                case 3:
                    addPrescription();
                    break;

                case 4:
                    viewPrescription();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }

    // Book Appointment
    static void bookAppointment() {
        System.out.println("\n--- Book Appointment ---");

        System.out.print("Enter Patient Name: ");
        patientName = sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        doctorName = sc.nextLine();

        System.out.print("Enter Appointment Date: ");
        appointmentDate = sc.nextLine();

        System.out.println("Appointment booked successfully!");
    }

    // View Appointment
    static void viewAppointment() {
        System.out.println("\n--- Appointment Details ---");

        if (patientName == null) {
            System.out.println("No appointment found.");
        } else {
            System.out.println("Patient Name : " + patientName);
            System.out.println("Doctor Name  : " + doctorName);
            System.out.println("Date         : " + appointmentDate);
        }
    }

    // Add Prescription
    static void addPrescription() {
        System.out.println("\n--- Add Prescription ---");

        if (patientName == null) {
            System.out.println("Please book an appointment first.");
        } else {
            System.out.print("Enter Prescription: ");
            prescription = sc.nextLine();

            System.out.println("Prescription added successfully!");
        }
    }

    // View Prescription
    static void viewPrescription() {
        System.out.println("\n--- Prescription ---");

        if (prescription == null) {
            System.out.println("No prescription found.");
        } else {
            System.out.println("Patient Name : " + patientName);
            System.out.println("Prescription : " + prescription);
        }
    }
}