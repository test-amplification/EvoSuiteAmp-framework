package org.evosuite.testsuite;

import org.evosuite.testcase.TestChromosome;
import org.evosuite.testcase.TestFitnessFunction;

import java.util.AbstractMap;

public class muDistanceAnalysis {

    private TestFitnessFunction testFitnessFunction = null;
    private AbstractMap.SimpleEntry<String,Double> distance = null;
    private String testName = "";
    private TestChromosome testChromosome = null;

    public muDistanceAnalysis(TestFitnessFunction goal, AbstractMap.SimpleEntry<String, Double> distance2, String name, TestChromosome tC) {
        testFitnessFunction = goal;
        distance = distance2;
        testName = name;
        testChromosome = tC;
    }

    public TestFitnessFunction getGoal() {
        return testFitnessFunction;
    }

    public AbstractMap.SimpleEntry<String, Double> getDistance() {
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

    public void setDistance(AbstractMap.SimpleEntry<String, Double> distance){
        this.distance = distance;
    }

    public void setTestName(String testName){
        this.testName = testName;
    }

    public void setTestChromosome(TestChromosome testChromosome){
        this.testChromosome = testChromosome;
    }
}