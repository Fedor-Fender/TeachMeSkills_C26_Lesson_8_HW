package com.techmeskills.homework_8;

import com.techmeskills.homework_8.doctor.Patient;
import com.techmeskills.homework_8.doctor.Therapist;

public class TestProgramClinik {
    public static void main(String[] args) {

//        to create objects
        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(3);

        patient1.setPlanTreatment(3);

//        to call method to find out how way of treatment match patient
        Therapist.findWayTreatment(patient1);
        Therapist.findWayTreatment(patient2);
        Therapist.findWayTreatment(patient3);
    }
}
