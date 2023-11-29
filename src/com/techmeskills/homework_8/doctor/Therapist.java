package com.techmeskills.homework_8.doctor;

public class Therapist extends Doctor {

    @Override
    public void treatPatient() {
        System.out.println("Treatment by a therapist");
    }
    public static void findWayTreatment(Patient patient) {
        if (patient.getPlanTreatment() == 1) {
            Doctor doctor = new Surgeon();
            doctor.treatPatient();
        } else if (patient.getPlanTreatment() == 2) {
            Doctor doctor = new Dentist();
            doctor.treatPatient();
        } else {
            Doctor doctor = new Therapist();
            doctor.treatPatient();
        }
    }
}
