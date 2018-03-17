package com.example.nmrat.wajdnmrat;

/**
 * Created by ASUS on 26/01/2018.
 */

public class Security extends Person
{
    protected double Age;
    protected int Weapon_number;
    protected int Telephone_number;

    public Security(double age, int weapon_number, int telephone_number) {
        Age = age;
        Weapon_number = weapon_number;
        Telephone_number = telephone_number;
    }

    public Security() {
    }

    public double getAge() {
        return Age;
    }

    public void setAge(double age) {
        Age = age;
    }

    public int getWeapon_number() {
        return Weapon_number;
    }

    public void setWeapon_number(int weapon_number) {
        Weapon_number = weapon_number;
    }

    public int getTelephone_number() {
        return Telephone_number;
    }

    public void setTelephone_number(int telephone_number) {
        Telephone_number = telephone_number;
    }

    @Override
    public String toString() {
        return "Security{" +
                "Age=" + Age +
                ", Weapon_number=" + Weapon_number +
                ", Telephone_number=" + Telephone_number +
                '}';
    }
}
