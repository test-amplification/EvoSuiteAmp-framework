package org.evosuite.testsuite;

import org.evosuite.testcase.TestChromosome;
import org.evosuite.testcase.TestFitnessFunction;

import javafx.util.Pair;

public class muDistanceAnalysis {

    private TestFitnessFunction testFitnessFunction = null;
    private Pair<String,Double> distance = null;
    private String testName = "";
    private TestChromosome testChromosome = null;

    public muDistanceAnalysis(TestFitnessFunction goal, Pair<String, Double> distance2, String name, TestChromosome tC) {
        testFitnessFunction = goal;
        distance = distance2;
        testName = name;
        testChromosome = tC;
    }

    public TestFitnessFunction getGoal() {
        return testFitnessFunction;
    }

    public Pair<String, Double> getDistance() {
        return distance;
    }

    public String getTestName() {
        return testName;
    }

    public TestChromosome getTestChromosome(){
        return testChromosome;
    }

    public void setGoal(TestFitnessFunction testFitnessFunction){
        this.testFitnessFunction = testFitnessFunction;
    }

    public void setDistance(Pair<String, Double> distance){
        this.distance = distance;
    }

    public void setTestName(String testName){
        this.testName = testName;
    }

    public void setTestChromosome(TestChromosome testChromosome){
        this.testChromosome = testChromosome;
    }
}