package com.example.nmrat.wajdnmrat;

/**
 * Created by ASUS on 26/01/2018.
 */

public class Professor extends Person
{
    protected String specialty;
    protected String Phone;
    protected double Years_of_education;

    public Professor(String specialty, String phone, double years_of_education) {
        this.specialty = specialty;
        Phone = phone;
        Years_of_education = years_of_education;
    }

    public Professor() {
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String getPhone() {
        return Phone;
    }

    @Override
    public void setPhone(String phone) {
        Phone = phone;
    }

    public double getYears_of_education() {
        return Years_of_education;
    }

    public void setYears_of_education(double years_of_education) {
        Years_of_education = years_of_education;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "specialty='" + specialty + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Years_of_education=" + Years_of_education +
                '}';
    }
}
