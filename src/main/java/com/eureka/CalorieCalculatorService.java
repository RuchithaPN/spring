package com.eureka;



import java.util.List;

public interface CalorieCalculatorService {

    double calculate(CalorieRequest calorieRequest);

    List<Double> getHistory();

    void resetHistory();

}