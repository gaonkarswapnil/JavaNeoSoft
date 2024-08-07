package oops;

import java.util.ArrayList;

class Person{
    private String id, name;
    private int age;

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Doctor extends Person{
    private String specialization;
    private double consultationFee;

    public Doctor(String id, String name, int age, String specialization, double consultationFee) {
        super(id, name, age);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public double calculateSalary() {
        return 5000+getConsultationFee();
    }
}

class Patient extends Person{
    private String ailment;
    private double admissionFee;
    private Doctor doctorAssigned;

    public Patient(String id, String name, int age, String ailment, double admissionFee) {
        super(id, name, age);
        this.ailment = ailment;
        this.admissionFee = admissionFee;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    public double getAdmissionFee() {
        return admissionFee;
    }

    public void setAdmissionFee(double admissionFee) {
        this.admissionFee = admissionFee;
    }

    public Doctor getDoctorAssigned() {
        return doctorAssigned;
    }

    public void setDoctorAssigned(Doctor doctorAssigned) {
        this.doctorAssigned = doctorAssigned;
    }

    public double calculateTotalBill(){
//        return admissionFee + (doctorAssigned!=null ? doctorAssigned.getConsultationFee() : 0);
        return admissionFee + doctorAssigned.getConsultationFee();
    }
}

class Staff extends Person{
    private String role;
    private double hourlyRate;
    private int hoursWorked;

    public Staff(String id, String name, int age, String role, double hourlyRate, int hoursWorked) {
        super(id, name, age);
        this.role = role;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }
}

abstract class HospitalService{
    public abstract void admitPatient(Patient patient);
    public abstract void assignDoctor(Patient patient, Doctor doctor);
}

class Hospital extends HospitalService{
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Staff> staffs = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addStaff(Staff staff){
        staffs.add(staff);
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public void setStaff(ArrayList<Staff> staff) {
        this.staffs = staff;
    }

    @Override
    public void admitPatient(Patient patient) {
        patients.add(patient);
    }

    @Override
    public void assignDoctor(Patient patient, Doctor doctor) {
        patient.setDoctorAssigned(doctor);
    }
}

public class HospitalMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doctor1 = new Doctor("1","Doctor1",25,"Heart Disease",1500);
        Doctor doctor2 = new Doctor("2","Doctor2",25,"Migrane",1200);
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        Staff staff1 = new Staff("1","Staff1",30,"helper",200,5);
        Staff staff2 = new Staff("2","Staff2",30,"Nurse",250,6);
        hospital.addStaff(staff1);
        hospital.addStaff(staff2);

        Patient patient1 = new Patient("1","Patient1",20,"Heart Disease", 1500);
        Patient patient2 = new Patient("2","Patient2",20,"Migrane",1200);
        hospital.admitPatient(patient1);
        hospital.admitPatient(patient2);

        hospital.assignDoctor(patient1,doctor1);
        hospital.assignDoctor(patient2,doctor2);

        displayPersonDetails(doctor1);
        System.out.println(" Doctor1 Salary: "+doctor1.calculateSalary());
        displayPersonDetails(doctor2);
        System.out.println(" Doctor2 Salary: "+doctor2.calculateSalary());

        displayPersonDetails(staff1);
        System.out.println(" Staff1 Salary: "+staff1.calculateSalary());
        displayPersonDetails(staff2);
        System.out.println(" Staff2 Salary: "+staff2.calculateSalary());

        displayPersonDetails(patient1);
        System.out.println(" Patient1 fees "+patient1.calculateTotalBill()+" Doctor Assign: "+patient1.getDoctorAssigned().getName());
        displayPersonDetails(patient2);
        System.out.println(" Patient2 fees "+patient2.calculateTotalBill()+" Doctor Assign: "+patient2.getDoctorAssigned().getName());

    }

    public static void displayPersonDetails(Person person){
        System.out.print("Id: "+person.getId());
        System.out.print(" Name: "+person.getName());
        System.out.print(" Age: "+person.getAge());
    }
}
