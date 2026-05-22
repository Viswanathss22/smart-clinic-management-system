package com.smartcare.clinic.model;

public class Appointment {

    private Long id;
    private String patientName;
    private String doctorName;
    private String appointmentDate;
    private String appointmentTime;

    public Appointment() {
    }

    public Appointment(Long id, String patientName, String doctorName,
                       String appointmentDate, String appointmentTime) {

        this.id = id;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }

    public Long getId() {
        return id;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }
}