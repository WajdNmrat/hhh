package com.example.nmrat.wajdnmrat;

/**
 * Created by ASUS on 26/01/2018.
 */

public class Maintenance_workers extends Person
{
    protected String Experience;
    protected String Tools;
    protected int Children;

    public Maintenance_workers(String experience, String tools, int children) {
        Experience = experience;
        Tools = tools;
        Children = children;
    }

    public Maintenance_workers() {
    }

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }

    public String getTools() {
        return Tools;
    }

    public void setTools(String tools) {
        Tools = tools;
    }

    public int getChildren() {
        return Children;
    }

    public void setChildren(int children) {
        Children = children;
    }

    @Override
    public String toString() {
        return "Maintenance_workers{" +
                "Experience='" + Experience + '\'' +
                ", Tools='" + Tools + '\'' +
                ", Children=" + Children +
                '}';
    }
}
