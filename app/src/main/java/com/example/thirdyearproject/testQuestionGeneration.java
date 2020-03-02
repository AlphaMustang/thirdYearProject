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

    public static question calculationFoundationQuestion() {
        float randomNumber = (float) Math.random();
        if (randomNumber < 0.3333) { return numberFoundationQuestionOne(); }
        else if (randomNumber < 0.66667) { return numberFoundationQuestionFour(); }
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
            case 1: questionText.add("\u00B9");
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

    public static question calculationHigherQuestion() {
        return numberHigherQuestionOne();
    }

    // Structure and Calculation (higher)
    private static question numberHigherQuestionOne() {
        ArrayList<String> questionText = new ArrayList<String>();
        int v, u, a;
        float intermediary;
        do{
            v = (int) ((Math.random() * 6) + 3);
            u = (int) (Math.random() * 5);
            a = (int) (Math.random() * 5) + 2;
            intermediary = (v * v) - (u * u);
            intermediary = intermediary / (2 * a);
        } while ((int) intermediary != intermediary);
        questionText.add("v\u00B2 = u\u00B2 + 2as.");
        questionText.add("Let u = " + Integer.toString(u) + ", a = " + Integer.toString(a) + ", and s = " + Float.toString(intermediary));
        questionText.add(". What is the value of v to the nearest whole number?");
        return new question(0,0,questionText,"None",v);
    }

    public static question fractionFoundationQuestion() {
        return numberFoundationQuestionTwo();
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

    public static question fractionHigherQuestion() {
        return numberFoundationQuestionTwo();
    }

    public static question accuracyFoundationQuestion() {
        return numberFoundationQuestionThree();
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

    public static question accuracyHigherQuestion() {
        return numberFoundationQuestionThree();
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
        if ( randomNumber > 0.8 ) { return algebraFoundationQuestionOne(); }
        else if (randomNumber > 0.6) { return algebraFoundationQuestionTwo(); }
        else if (randomNumber > 0.4) { return algebraFoundationQuestionThree(); }
        else if (randomNumber > 0.2) { return algebraFoundationQuestionFour(); }
        else { return algebraFoundationQuestionFive(); }
    }

    // Solving Equations and Inequalities (foundation)
    private static question algebraFoundationQuestionOne() {
        ArrayList<String> questionText = new ArrayList<>();
        questionText.add("v + u = ");
        int v = (int) Math.round(Math.random() * 30);
        int u = (int) Math.round(Math.random() * 30);
        int sum = u + v;
        questionText.add(Integer.toString(sum) + ". u = ");
        questionText.add(Integer.toString(u) + ". What is v?");
        return new question(1,0,questionText,"None",v);
    }

    // Solving Equations and Inequalities (foundation)
    private static question algebraFoundationQuestionThree() {
        ArrayList<String> questionText = new ArrayList<String>();
        int aValue = (int) Math.round(Math.random() * 5);
        int bValue = (int) Math.round(Math.random() * 5);
        int aMultiple = (int) Math.round(Math.random() * 3);
        int bMultiple = (int) Math.round(Math.random() * 3);
        questionText.add("a = ");
        questionText.add(Integer.toString(aValue) + ", b = " + Integer.toString(bValue));
        questionText.add(". Work out the value of ");
        questionText.add(Integer.toString(aMultiple) + "a + " + Integer.toString(bMultiple) + "b");
        int answer = (aValue * aMultiple) + (bValue * bMultiple);
        return new question(1,0,questionText,"None",answer);
    }

    // Solving Equations and Inequalities (foundation)
    private static question algebraFoundationQuestionFive() {
        ArrayList<String> questionText = new ArrayList<String>();
        int y = (int) Math.round((Math.random() * 4) + 1);
        int answer = (int) Math.round((Math.random() * 3) + 1);
        int problem = y * answer;
        questionText.add(Integer.toString(y) + "x = " + Integer.toString(problem));
        questionText.add(". What is x?");
        return new question(1,0,questionText,"None",answer);
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


    // Sequences (foundation)
    private static question algebraFoundationQuestionFour() {
        ArrayList<String> questionText = new ArrayList<String>();
        int multiple = (int) Math.round((Math.random() * 4) + 1);
        int plusThis = (int) Math.round((Math.random() * 2) + 1);
        int currentNumber;
        for (int i = 1; i <= 4; i++) {
            currentNumber = ((multiple * i) + plusThis);
            questionText.add(Integer.toString(currentNumber) + ", ");
        }
        questionText.add(" This sequence follows the pattern add ");
        questionText.add(Integer.toString(multiple));
        questionText.add(" to the previous term, what is the next term?");
        int answer = (5 * multiple) + plusThis;
        return new question(1,0,questionText,"None",answer);
    }

    public static question algebraHigherQuestion() {
        float random = (float) Math.random();
        if ( random < 0.15 ) { return algebraHigherQuestionOne(); }
        else if ( random < 0.4 ) { return algebraHigherQuestionTwo(); }
        else { return algebraHigherQuestionThree(); }
    }

    // Graphs | solving equations and inequalities
    private static question algebraHigherQuestionOne() {
        ArrayList<String> questionText = new ArrayList<String>();
        questionText.add("What is the value of cos(0)?");
        return new question(1,0,questionText,"None",1);
    }

    // Graphs | solving equations and inequalities
    private static question algebraHigherQuestionTwo() {
        ArrayList<String> questionText = new ArrayList<String>();
        questionText.add("What is the value of sin(0)?");
        return new question(1,0,questionText,"None",0);
    }

    // solving equations and inequalities
    private static question algebraHigherQuestionThree() {
        ArrayList<String> questionText = new ArrayList<String>();
        int base = (int) Math.round(Math.random() * 5);
        int pow = (int) Math.round(Math.random() * 4);
        questionText.add("What is " + Integer.toString(base));
        switch (pow) {
            case 0: questionText.add("\u2070");
                break;
            case 1: questionText.add("\u00B9");
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
        int answer = (int) Math.pow(base,pow);
        return new question(0,0,questionText,"None",answer);
    }


    /*
    * Ratio Question Generation
    *
    * Submodules:
    *   Ratio, Proportion and Rates of Change
    * */

    public static question ratioFoundationQuestion() {
        float randomNumber = (float) Math.random();
        if (randomNumber > 0.7) { return ratioFoundationQuestionOne();}
        else if (randomNumber > 0.3){ return ratioFoundationQuestionTwo(); }
        else { return ratioFoundationQuestionThree(); }

    }

    // (foundation)
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

    // (foundation)
    private static question ratioFoundationQuestionTwo() {
        ArrayList<String> questionText = new ArrayList<String>();
        questionText.add("Adam has some apples and oranges. The ratio of apples to oranges is ");
        int ratioOfApples = (int) Math.round((Math.random() * 3) + 1);
        int ratioOfOranges = (int) Math.round((Math.random() * 3) + 1);
        int difference = (int) Math.round((Math.random() * 9) + 1);
        questionText.add(Integer.toString(ratioOfApples) + ":" + Integer.toString(ratioOfOranges));
        int noOfApples = difference * ratioOfApples;
        int noOfOranges = difference * ratioOfOranges;
        questionText.add(". Adam has " + Integer.toString(noOfApples) + " apples");
        questionText.add(" how many oranges does Adam have?");
        return new question( 2,0,questionText,"None",noOfOranges);
    }

    // (foundation)
    private static question ratioFoundationQuestionThree() {
        ArrayList<String> questionText = new ArrayList<String>();
        int ratioOfOJ = (int) Math.round((Math.random() * 5) + 1);
        int ratioOfLemonade = (int) Math.round((Math.random() * 2) + 1);
        int difference = (int) (Math.round((Math.random() * 2) + 1) * 100);
        int amountOfOJ = ratioOfOJ * difference;
        int amountOfLemonade = ratioOfLemonade * difference;
        questionText.add("Brandon is going to make a fizzy drink. The instructions say the drink should be ");
        questionText.add(Integer.toString(ratioOfOJ) + " parts Orange Juice and ");
        questionText.add(Integer.toString(ratioOfLemonade) + " parts lemonade.");
        questionText.add(" Brandon has ");
        questionText.add(Integer.toString(amountOfOJ) + " of Orange Juice, how much lemonade should he add?");
        return new question(2,0,questionText,"None",amountOfLemonade);
    }

    private static question ratioFoundationQuestionFour() {
        ArrayList<String> questionText = new ArrayList<String>();
        int difference = (int) Math.round(((Math.random() * 4) + 1) * 10);
        int noOfInitialTaps = (int) Math.round((Math.random() * 3) + 3);
        int noOfTapsAfter = (int) Math.round((Math.random() * 2) + 1);
        int amountOfInitialTime = noOfInitialTaps * difference;
        int amountOfTimeAfter = noOfTapsAfter * difference;
        questionText.add("It takes ");
        questionText.add(Integer.toString(amountOfInitialTime) + " minutes to fill a swimming pool using ");
        questionText.add(Integer.toString(noOfInitialTaps) + " hoses. How long would it take to fill a swimming pool using ");
        questionText.add(Integer.toString(noOfTapsAfter) + " hoses?");
        return new question(2,0,questionText,"None",amountOfTimeAfter);
    }

    private static question ratioHigherQuestionOne() {
        ArrayList<String> questionText = new ArrayList<String>();
        int difference = (int) Math.round(((Math.random() * 4) + 1) * 10);
        int noOfInitialTaps = (int) Math.round((Math.random() * 3) + 3);
        int noOfTapsAfter = (int) Math.round((Math.random() * 2) + 1);
        int amountOfInitialTime = noOfInitialTaps * difference;
        int amountOfTimeAfter = noOfTapsAfter * difference;
        questionText.add("It takes ");
        questionText.add(Integer.toString(amountOfInitialTime) + " minutes to fill a swimming pool using ");
        questionText.add(Integer.toString(noOfInitialTaps) + " hoses. How long would it take to fill a swimming pool using ");
        questionText.add(Integer.toString(noOfTapsAfter) + " hoses?");
        return new question(2,0,questionText,"None",amountOfTimeAfter);
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
        int xInitial = (int) Math.round(Math.random() * 2);
        int addedValue = (int) Math.round((Math.random() * 1) + 1);
        questionText.add("What would the x coordinate be if you moved ");
        questionText.add(Integer.toString(addedValue) + " to the right from ");
        questionText.add("x = " + Integer.toString(xInitial));
        int answer = xInitial + addedValue;
        return new question(3,0,questionText,"coordinates",answer);
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
        if (randomNumber > 0.5) { return probabilityFoundationQuestionOne(); }
        else { return probabilityFoundationQuestionTwo(); }
    }

    private static question probabilityFoundationQuestionOne() {
        ArrayList<String> questionText = new ArrayList<String>();
        int heads = (int) (Math.round(Math.random() * 9)) + 1;
        int coinsFlipped = heads * 2;
        questionText.add("A coin is flipped ");
        questionText.add(Integer.toString(coinsFlipped));
        questionText.add(" times. How many times should it land on heads?");
        return new question(4,0,questionText,"None",heads);
    }

    private static question probabilityFoundationQuestionTwo() {
        ArrayList<String> questionText = new ArrayList<String>();
        int redPens = (int) Math.round(Math.random() * 4);
        int bluePens = (int) Math.round(Math.random() * 4);
        int blackPens = (int) Math.round(Math.random() * 4);
        int penSelection = (int) Math.round(Math.random() * 2) + 1;
        questionText.add("There are " + Integer.toString(redPens) + " red pens, ");
        questionText.add(Integer.toString(bluePens) + " blue pens, and ");
        questionText.add(Integer.toString(blackPens) + " black pens in a bag. A pen is picked at random from the bag.");
        questionText.add("What are the odds, as a percentage, that the pen selected is a ");
        int answer;
        int totalPens = redPens + bluePens + blackPens;
        if ( penSelection == 1 ) {
            questionText.add("red pen?");
            answer = (int) ((redPens * 100) / totalPens);
        } else if ( penSelection == 2 ) {
            questionText.add("blue pen?");
            answer = (int) ((bluePens * 100) / totalPens);
        } else if ( penSelection == 3 ) {
            questionText.add("black pen?");
            answer = (int) ((blackPens * 100) / totalPens);
        } else {
            answer = -1;
        }
        return new question(4,0,questionText,"None",answer);
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
        int[] results = new int[7];
        for (int i = 0; i < 7; i++) {
            int result = (int) ((Math.random() * 10) + 15);
            results[i] = result;
        }
        questionText.add("Michael measures the temperature every day for a week. Here were his results: ");
        for (int i = 0; i < 7; i++) {
            questionText.add(Integer.toString(results[i]) + ", ");
        }
        questionText.add(" what is the mean of these results to the closest degree?");
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            sum += results[i];
        }
        sum = sum / 7;
        return new question(5,0,questionText,"None",sum);
    }

    private static question statisticsFoundationQuestionTwo() {
        ArrayList<String> questionText = new ArrayList<String>();
        return new question(5,0,questionText,"None",0);
    }


}
