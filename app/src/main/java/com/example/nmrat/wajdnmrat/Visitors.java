package com.example.nmrat.wajdnmrat;

/**
 * Created by ASUS on 26/01/2018.
 */

public class Visitors extends Person
{
    protected String Patient_name;
    protected String relative_relation;
    protected double Visitor_Age;

    public Visitors(String patient_name, String relative_relation, double visitor_Age) {
        Patient_name = patient_name;
        this.relative_relation = relative_relation;
        Visitor_Age = visitor_Age;
    }

    public Visitors() {
    }

    public String getPatient_name() {
        return Patient_name;
    }

    public void setPatient_name(String patient_name) {
        Patient_name = patient_name;
    }

    public String getRelative_relation() {
        return relative_relation;
    }

    public void setRelative_relation(String relative_relation) {
        this.relative_relation = relative_relation;
    }

    public double getVisitor_Age() {
        return Visitor_Age;
    }

    public void setVisitor_Age(double visitor_Age) {
        Visitor_Age = visitor_Age;
    }

    @Override
    public String toString() {
        return "Visitors{" +
                "Patient_name='" + Patient_name + '\'' +
                ", relative_relation='" + relative_relation + '\'' +
                ", Visitor_Age=" + Visitor_Age +
                '}';
    }
}
