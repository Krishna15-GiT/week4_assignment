// HospitalRecords.java(Ques 11)

// Base class Patient
class Patient {
    private String name;
    private int age;

    // Constructor
    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getTreatmentPlan() {
        System.out.println("General Plan");
    }
}

// Subclass for InPatient
class InPatient extends Patient {
    private int roomNumber;

    public InPatient(String name, int age, int roomNumber) {
        super(name, age); // calls parent constructor with values
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public void getTreatmentPlan() {
        System.out.println("In-Patient Plan:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Room: " + roomNumber);
    }
}

// Subclass for OutPatient
class OutPatient extends Patient {
    private String appointmentDate;

    public OutPatient(String name, int age, String appointmentDate) {
        super(name, age); // calls parent constructor with values
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    @Override
    public void getTreatmentPlan() {
        System.out.println("Out-Patient Plan:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Appointment: " + appointmentDate);
    }
}

// Main class to test
public class HospitalRecords {
    public static void main(String[] args) {
        Patient patient1 = new InPatient("aasish", 19, 201);
        Patient patient2 = new OutPatient("dipson", 17, "2024-04-27");

        patient1.getTreatmentPlan();
        patient2.getTreatmentPlan();
    }
}