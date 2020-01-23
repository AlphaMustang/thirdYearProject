package com.example.thirdyearproject;

/*
* Factory class which generates test questions for each submodule.
* */

import java.util.ArrayList;

public class testQuestionGeneration {

    /*
    * Number Question Generation:
    *
    * Submodules:
    *   Structure and Calculation
    *   Fractions, Decimals, and Percentages
    *   Measures and Accuracy
    * */

    public static question numberEasyQuestionOne() {
        ArrayList<String> questionText = new ArrayList<String>();
        questionText.add("Which one of these numbers is the smallest: ");
        int currentNumber;
        int smallestNumber = 501;
        for (int i = 0; i < 5; i++) {
            currentNumber = (int) Math.round(Math.random() * 500);
            if (currentNumber < smallestNumber) { smallestNumber = currentNumber; }
            questionText.add(Integer.toString(currentNumber) + "    ");
        }
        questionText.add(".");
        return new question(0,0,questionText,"none",smallestNumber);
    }

//    public static question numberEasyQuestionTwo() {
//
//    }


    /*
    * Algebra Question Generation
    *
    * Submodules:
    *   Notation
    *   Vocabulary and Manipulation
    *   Graphs
    *   Solving Equations and Inequalities
    *   Sequences
    * */

    public static question algebraEasyQuestionOne() {
        ArrayList<String> questionText = new ArrayList<String>();
        questionText.add("v + u = ");
        int v = (int) Math.round(Math.random() * 30);
        int u = (int) Math.round(Math.random() * 30);
        int sum = u + v;
        questionText.add(Integer.toString(sum) + ". u = ");
        questionText.add(Integer.toString(u) + ". What is v?");
        return new question(1,0,questionText,"None",v);
    }


    /*
    * Ratio Question Generation
    *
    * Submodules:
    *   Ratio, Proportion and Rates of Change
    * */

    public static question ratioEasyQuestionOne() {
        ArrayList<String> questionText = new ArrayList<String>();
        questionText.add("Tom has a coin collection. He collects pennies and pounds, he has a ratio of pennies to pounds of ");
        int firstRatio = (int) Math.round(Math.random() * 6);
        int secondRatio = (int) Math.round(Math.random() * 2);
        questionText.add(Integer.toString(firstRatio) + ":" + Integer.toString(secondRatio));
        int amountOfPounds = (int) (Math.round(Math.random() * 5) * 10);
        questionText.add(". Tom has " + Integer.toString(amountOfPounds) + " pounds, how many pennies does he have? (to the closest penny)");
        int finalAnswer = Math.round(((amountOfPounds / secondRatio) * firstRatio));
        return new question(2,0,questionText,"None",finalAnswer);
    }


    /*
    * Geometry Question Generation
    *
    * Submodules:
    *   Properties and Constructions
    *   Mensuration and Calculation
    *   Vectors
    * */


    /*
    * Probability Question Generation
    *
    * Submodules:
    *   Probability
    * */

    public static question probabilityEasyQuestionOne() {
        ArrayList<String> questionText = new ArrayList<String>();
        questionText.add("What is the probablity of flipping a coin x 10?");
        return new question(4,0,questionText,"None",5);
    }


    /*
    * Statistics Question Generation
    *
    * Submodules:
    *   Statistics
    * */

    public static question statisticsEasyQuestionOne(){
        ArrayList<String> questionText = new ArrayList<String>();
        questionText.add("");
    }


}
