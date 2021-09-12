package com.syntax.GroupProject2;

public class MarksTester {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(95,98.5,89);
        studentA.getPercentage();

        StudentB studentB = new StudentB(79,85.5,90.1,95);
        studentB.getPercentage();
    }
}
