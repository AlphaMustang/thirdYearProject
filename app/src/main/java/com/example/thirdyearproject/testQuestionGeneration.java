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

    public static question numberFoundationQuestion() {
        float randomNumber = (float) Math.random();
        if (randomNumber > 0.8) { return numberFoundationQuestionOne(); }
        else if (randomNumber > 0.6) { return numberFoundationQuestionTwo(); }
        else if (randomNumber > 0.4) { return numberFoundationQuestionThree(); }
        else if (randomNumber > 0.2) { return numberFoundationQuestionFour(); }
        else { return numberFoundationQuestionFive(); }
    }

    // Structure and Calculation (foundation)
    private static question numberFoundationQuestionOne() {
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
        return new question(0,0,questionText,"None",smallestNumber);
    }

    // Structure and Calculation (foundation)
    private static question numberFoundationQuestionFour() {
        ArrayList<String> questionText = new ArrayList<String>();
        int randomNumberOne = (int) (Math.random() * 100);
        int randomNumberTwo = (int) (Math.random() * 100);
        questionText.add("What is ");
        questionText.add(Integer.toString(randomNumberOne) + " + " + Integer.toString(randomNumberTwo) + "?");
        int answer = randomNumberOne + randomNumberTwo;
        return new question(0,0,questionText,"None",answer);
    }

    // Structure and Calculation (foundation)
    private static question numberFoundationQuestionFive() {
        ArrayList<String> questionText = new ArrayList<String>();
        int pow = (int) Math.round(Math.random() * 5);
        questionText.add("What is 2");
        switch (pow) {
            case 0: questionText.add("\u2070");
                break;
            case 1: questionText.add("\u2071");
                break;
            case 2: questionText.add("\u00B2");
                break;
            case 3: questionText.add("\u00B3");
                break;
            case 4: questionText.add("\u2074");
                break;
            case 5: questionText.add("\u2075");
                break;
            default: questionText.add("\u2070");
        }
        int answer = (int) Math.pow(2,pow);
        return new question(0,0,questionText,"None",answer);
    }

    // Fractions, Decimals, and Percentages (foundation)
    private static question numberFoundationQuestionTwo() {
        ArrayList<String> questionText = new ArrayList<String>();
        int numberOfMagnitude = (int) (Math.round(Math.random() * 8));
        numberOfMagnitude = numberOfMagnitude + 1;
        float randomNumber = (float) numberOfMagnitude / 10;
        questionText.add("Write ");
        questionText.add(Float.toString(randomNumber));
        questionText.add(" as a percentage.");
        int answer = numberOfMagnitude * 10;
        return new question(0,0,questionText,"None", answer);
    }

    // Measures and Accuracy (foundation)
    private static question numberFoundationQuestionThree() {
        ArrayList<String> questionText = new ArrayList<String>();
        questionText.add("Round ");
        float randomNumber = (float) (Math.random() * 9);
        questionText.add(Float.toString(randomNumber));
        questionText.add(" to the nearest whole number.");
        int answer = Math.round(randomNumber);
        return new question(0,0,questionText, "None", answer);
    }

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

    public static question algebraFoundationQuestion() {
        float randomNumber = (float) Math.random();
        if ( randomNumber > 0.5 ) { return algebraFoundationQuestionOne(); }
        else { return algebraFoundationQuestionTwo(); }

    }

    // Solving Equations and Inequalities (foundation)
    private static question algebraFoundationQuestionOne() {
        ArrayList<String> questionText = new ArrayList<String>();
        questionText.add("v + u = ");
        int v = (int) Math.round(Math.random() * 30);
        int u = (int) Math.round(Math.random() * 30);
        int sum = u + v;
        questionText.add(Integer.toString(sum) + ". u = ");
        questionText.add(Integer.toString(u) + ". What is v?");
        return new question(1,0,questionText,"None",v);
    }

    // Sequences (foundation)
    private static question algebraFoundationQuestionTwo() {
        ArrayList<String> questionText = new ArrayList<String>();
        questionText.add("What's the next number in the sequence: ");
        int base = (int) (Math.round(Math.random() * 2) + 1);
        int currentMultiple = (int) (Math.round(Math.random() * 2) + 1);
        int currentValue;
        for (int i = 0; i < 4; i++) {
            currentValue = base * currentMultiple;
            questionText.add(Integer.toString(currentValue));
            questionText.add(", ");
            currentMultiple++;
        }
        questionText.add("?");
        currentValue = base * currentMultiple;
        return new question(1,0,questionText,"None",currentValue);
    }


    /*
    * Ratio Question Generation
    *
    * Submodules:
    *   Ratio, Proportion and Rates of Change
    * */

    public static question ratioFoundationQuestion() {
        float randomNumber = (float) Math.random();
        if (randomNumber > 0) { return ratioFoundationQuestionOne();}
        else { return ratioFoundationQuestionTwo(); }

    }

    private static question ratioFoundationQuestionOne() {
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

    private static question ratioFoundationQuestionTwo() {
        ArrayList<String> questionText = new ArrayList<String>();
        return new question(2,0,questionText,"None",0);
    }


    /*
    * Geometry Question Generation
    *
    * Submodules:
    *   Properties and Constructions
    *   Mensuration and Calculation
    *   Vectors
    * */

    public static question geometryFoundationQuestion() {
        float randomNumber = (float) Math.random();
        if (randomNumber > 0) { return geometryFoundationQuestionOne(); }
        else { return geometryFoundationQuestionTwo(); }
    }

    private static question geometryFoundationQuestionOne() {
        ArrayList<String> questionText = new ArrayList<String>();
        return new question(3,0,questionText,"None",0);
    }

    private static question geometryFoundationQuestionTwo() {
        ArrayList<String> questionText = new ArrayList<String>();
        return new question(3,0,questionText,"None",0);
    }

    /*
    * Probability Question Generation
    *
    * Submodules:
    *   Probability
    * */

    public static question probabilityFoundationQuestion() {
        float randomNumber = (float) Math.random();
        if (randomNumber > 0) { return probabilityFoundationQuestionOne(); }
        else { return probabilityFoundationQuestionTwo(); }
    }

    private static question probabilityFoundationQuestionOne() {
        ArrayList<String> questionText = new ArrayList<String>();
        questionText.add("What is the probablity of flipping a coin x 10?");
        return new question(4,0,questionText,"None",5);
    }

    private static question probabilityFoundationQuestionTwo() {
        ArrayList<String> questionText = new ArrayList<String>();
        return new question(4,0,questionText,"None",0);
    }


    /*
    * Statistics Question Generation
    *
    * Submodules:
    *   Statistics
    * */

    public static question statisticsFoundationQuestion() {
        float randomNumber = (float) Math.random();
        if (randomNumber > 0) { return statisticsFoundationQuestionOne(); }
        else { return statisticsFoundationQuestionTwo(); }
    }

    private static question statisticsFoundationQuestionOne(){
        ArrayList<String> questionText = new ArrayList<String>();
        questionText.add("");
        return new question(5,0,questionText,"None",0);
    }

    private static question statisticsFoundationQuestionTwo() {
        ArrayList<String> questionText = new ArrayList<String>();
        return new question(5,0,questionText,"None",0);
    }


}
