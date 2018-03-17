package com.example.nmrat.wajdnmrat;

/**
 * Created by ASUS on 26/01/2018.
 */

public class Secretarial extends Person
{
    protected String Experience_languages;
    protected String Computer_Experience;
    protected int Children;

    public Secretarial(String experience_languages, String computer_Experience, int children) {
        Experience_languages = experience_languages;
        Computer_Experience = computer_Experience;
        Children = children;
    }

    public Secretarial() {
    }


    public String getExperience_languages() {
        return Experience_languages;
    }

    public void setExperience_languages(String experience_languages) {
        Experience_languages = experience_languages;
    }

    public String getComputer_Experience() {
        return Computer_Experience;
    }

    public void setComputer_Experience(String computer_Experience) {
        Computer_Experience = computer_Experience;
    }

    public int getChildren() {
        return Children;
    }

    public void setChildren(int children) {
        Children = children;
    }

    @Override
    public String toString() {
        return "Secretarial{" +
                "Experience_languages='" + Experience_languages + '\'' +
                ", Computer_Experience='" + Computer_Experience + '\'' +
                ", Children=" + Children +
                '}';
    }
}
