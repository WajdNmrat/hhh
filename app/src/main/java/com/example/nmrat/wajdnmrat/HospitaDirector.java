package com.example.nmrat.wajdnmrat;

/**
 * Created by ASUS on 26/01/2018.
 */

public class HospitaDirector extends Person
{
    protected String specializatin;
    protected double experience;
    protected double sallary;
    public HospitaDirector(String specializatin, double experience, double sallary)
    {
        this.specializatin = specializatin;
        this.experience = experience;
        this.sallary = sallary;
    }

    public HospitaDirector() {
    }

    public String getSpecializatin() {
        return specializatin;
    }

    public void setSpecializatin(String specializatin) {
        this.specializatin = specializatin;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specializatin='" + specializatin + '\'' +
                ", experience=" + experience +
                ", sallary=" + sallary +
                '}';
    }





}
