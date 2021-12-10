package main.mealplanner.service;
import java.util.Scanner;

class BodyMassIndex {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter next person's information:");
        System.out.print("height (in cm)? ");
        double height = console.nextDouble();

        System.out.print("weight (in kg)? ");
        double weight = console.nextDouble();
        System.out.println();

        double bmi = weight / Math.pow(height, 2) * 703;
        System.out.println("BMI:" + bmi);

        if (bmi < 18.5) {
            System.out.print("underweight");
        } else if (bmi < 25) {
            System.out.print("normal");
        } else if (bmi < 30) {
            System.out.print("overweight");
        } else {
            System.out.print("obese");
        }

    }
}
