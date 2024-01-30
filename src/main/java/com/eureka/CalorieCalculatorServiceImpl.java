package com.eureka;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CalorieCalculatorServiceImpl implements CalorieCalculatorService {

    private final List<Double> history = new ArrayList<>();

    @Override
    public double calculate(CalorieRequest calorieRequest) {
        int age = calorieRequest.getAge();
        String gender = calorieRequest.getGender();
        double height = calorieRequest.getHeight();
        double weight = calorieRequest.getWeight();
        int activityLevel = calorieRequest.getActivityLevel();

        // validate input data
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        if (!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("F")) {
            throw new IllegalArgumentException(
                "Invalid gender. Please enter 'M' for male or 'F' for female.");
        }
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative.");
        }
        if (weight < 0) {
            throw new IllegalArgumentException("Weight cannot be negative.");
        }
        
        ActivityLevel level = ActivityLevel.values()[activityLevel - 1];
        double basalMetabolicRate = BasalMetabolicRateCalculator.calculate(age, gender, height, weight);
        double dailyCalorieNeeds = DailyCalorieNeedsCalculator.calculate(basalMetabolicRate, level);
        history.add(dailyCalorieNeeds);
        return dailyCalorieNeeds;
    }

    @Override
    public List<Double> getHistory() {
        return history;
    }

    @Override
    public void resetHistory() {
        history.clear();
    }
}
