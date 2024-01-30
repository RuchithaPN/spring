package com.eureka;



import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calories")
public class CalorieCalculatorController {

    private final CalorieCalculatorService calorieCalculatorService;

    public CalorieCalculatorController(CalorieCalculatorService calorieCalculatorService) {
        this.calorieCalculatorService = calorieCalculatorService;
    }

    @PostMapping("/calculate")
    public ResponseEntity<Double> calculateCalories(@RequestBody CalorieRequest calorieRequest) {
        double dailyCalorieNeeds = calorieCalculatorService.calculate(calorieRequest);
        return ResponseEntity.ok(dailyCalorieNeeds);
    }

    @GetMapping("/history")
    public ResponseEntity<List<Double>> getCalorieHistory() {
        List<Double> history = calorieCalculatorService.getHistory();
        return ResponseEntity.ok(history);
    }

    @DeleteMapping("/history")
    public ResponseEntity<Void> resetCalorieHistory() {
        calorieCalculatorService.resetHistory();
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/reset")
    public ResponseEntity<Void> resetHistory() {
        calorieCalculatorService.resetHistory();
        return ResponseEntity.noContent().build();
    }
}