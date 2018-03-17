package com.example.nmrat.wajdnmrat;

/**
 * Created by ASUS on 26/01/2018.
 */

public class Workers extends Person
{
    protected String specialization;
    protected double Salary;
    protected int Children;

    public Workers(String specialization, double salary, int children) {
        this.specialization = specialization;
        Salary = salary;
        Children = children;
    }

    public Workers() {
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public int getChildren() {
        return Children;
    }

    public void setChildren(int children) {
        Children = children;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "specialization='" + specialization + '\'' +
                ", Salary=" + Salary +
                ", Children=" + Children +
                '}';
    }
}
