package org.example;
// package con.company; //njemu stoji to,sto meni to pravi problem? //mozda to do verzije intelijea?

public class  Main {
    public static void main(String[] args) {
        System.out.println("first personal GIT project");



        bodyCalculator BMI = new bodyCalculator(80,1.93); //tezina u kg,visina u metrima
        System.out.println(BMI.calculateBMI());
    }
}