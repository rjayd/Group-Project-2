package com.syntax.GroupProject2;

public abstract class Marks {
    abstract void getPercentage();
}
class StudentA extends Marks{
    double Math,English,PE;

    StudentA(double Math, double English, double PE) {
       this.Math=Math;
       this.English= English;
       this.PE=PE;
    }
    public void getPercentage() {
        double average;
        average = (this.English +this.Math+this.PE)/3;
        System.out.println("The average grade of the StudentA is "+average+"%");
    }
}
class StudentB extends Marks{
    double Math, English, PE, Java;
    StudentB(double math, double english, double PE, double Java){
        this.Math = math;
        this.English = english;
        this.PE = PE;
        this.Java = Java;
    }

    @Override
    void getPercentage() {
        double average;
        average= (this.English+this.Math+this.Java+this.PE)/4;
        System.out.println("The average grade of the StudentB is "+average+"%");
    }
}