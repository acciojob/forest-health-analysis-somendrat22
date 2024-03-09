package com.driver;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/forest-health")
public class ForestHealthController {
    @PostMapping("/predict")
    public double predictForestHealth(@RequestBody ForestHealthRequest request) {
        // Perform complex mathematical calculations based on input parameters
        // In a real-world scenario, this would involve a more sophisticated algorithm
        double healthScore = calculateHealthScore(request);
        return healthScore;
    }

    private double calculateHealthScore(ForestHealthRequest request) {
        // Example: A simple health score calculation (you can replace it with a more complex model)
        return request.getAverageTreeAge() * 0.2
                + request.getRainfall() * 0.1
                - request.getPrevalentDiseases() * 0.3
                - request.getHumanInterference() * 0.2;
    }
}