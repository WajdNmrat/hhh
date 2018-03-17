package com.example.nmrat.wajdnmrat;

/**
 * Created by ASUS on 26/01/2018.
 */

public class The_patients extends Person
{
    protected String Cause_of_illness;
    protected String Drugs;
    protected String Method_of_treatment;

    public The_patients(String cause_of_illness, String drugs, String method_of_treatment) {
        Cause_of_illness = cause_of_illness;
        Drugs = drugs;
        Method_of_treatment = method_of_treatment;
    }

    public The_patients() {
    }

    public String getCause_of_illness() {
        return Cause_of_illness;
    }

    public void setCause_of_illness(String cause_of_illness) {
        Cause_of_illness = cause_of_illness;
    }

    public String getDrugs() {
        return Drugs;
    }

    public void setDrugs(String drugs) {
        Drugs = drugs;
    }

    public String getMethod_of_treatment() {
        return Method_of_treatment;
    }

    public void setMethod_of_treatment(String method_of_treatment) {
        Method_of_treatment = method_of_treatment;
    }

    @Override
    public String toString() {
        return "The_patients{" +
                "Cause_of_illness='" + Cause_of_illness + '\'' +
                ", Drugs='" + Drugs + '\'' +
                ", Method_of_treatment='" + Method_of_treatment + '\'' +
                '}';
    }
}
