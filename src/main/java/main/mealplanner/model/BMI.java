package main.mealplanner.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BMI {
    private int weight;
    private int height;
    private double result=0;
    private String status="";

    public BMI() {}

    public BMI(int weight, int height) {
        this.weight=weight;
        this.height=height;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getResult() {
        try {
            BigDecimal bd = BigDecimal.valueOf(result);
            bd = bd.setScale(2, RoundingMode.HALF_UP);
            return bd.doubleValue();
        }catch (Exception e){
            return 0;
        }

    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
