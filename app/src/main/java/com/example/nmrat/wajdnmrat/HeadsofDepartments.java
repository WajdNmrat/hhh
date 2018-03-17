package com.example.nmrat.wajdnmrat;

/**
 * Created by ASUS on 26/01/2018.
 */

public class HeadsofDepartments extends Person
{
    protected String specializatin;
    protected String certificates;
    protected double years_experience ;

    public HeadsofDepartments(String specializatin, String certificates, double years_experience) {
        this.specializatin = specializatin;
        this.certificates = certificates;
        this.years_experience = years_experience;
    }

    public HeadsofDepartments() {
    }

    public String getSpecializatin() {

        return specializatin;
    }

    public void setSpecializatin(String specializatin) {
        this.specializatin = specializatin;
    }

    public String getCertificates() {
        return certificates;
    }

    public void setCertificates(String certificates) {
        this.certificates = certificates;
    }

    public double getYears_experience() {
        return years_experience;
    }

    public void setYears_experience(double years_experience) {
        this.years_experience = years_experience;
    }

    @Override
    public String toString() {
        return "HeadsofDepartments{" +
                "specializatin='" + specializatin + '\'' +
                ", certificates='" + certificates + '\'' +
                ", years_experience=" + years_experience +
                '}';
    }
}
