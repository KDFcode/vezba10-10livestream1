package org.example;

public class bodyCalculator {
private double mass;
    private double height;

public bodyCalculator()
{}

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public  bodyCalculator(double tezina, double visina)
    {
        this.height=visina;
        this.mass=tezina;
    }

    public double calculateBMI () //BMIkalk()
    {
        double vracajOvo=0;
        vracajOvo= mass/(height*height);
        return vracajOvo;
    }
}
