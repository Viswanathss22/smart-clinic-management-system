package com.smartcare.clinic.model;

public class Doctor {

    private Long id;
    private String name;
    private String speciality;
    private String email;
    private String phone;

    public Doctor() {
    }

    public Doctor(Long id, String name, String speciality, String email, String phone) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}