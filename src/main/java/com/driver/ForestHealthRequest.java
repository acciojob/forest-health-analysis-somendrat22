package com.driver;

public class ForestHealthRequest {
    private double averageTreeAge;
    private double rainfall;
    private double prevalentDiseases;
    private double humanInterference;

    public double getAverageTreeAge() {
        return averageTreeAge;
    }

    public void setAverageTreeAge(double averageTreeAge) {
        this.averageTreeAge = averageTreeAge;
    }

    public double getRainfall() {
        return rainfall;
    }

    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
    }

    public double getPrevalentDiseases() {
        return prevalentDiseases;
    }

    public void setPrevalentDiseases(double prevalentDiseases) {
        this.prevalentDiseases = prevalentDiseases;
    }

    public double getHumanInterference() {
        return humanInterference;
    }

    public void setHumanInterference(double humanInterference) {
        this.humanInterference = humanInterference;
    }
}