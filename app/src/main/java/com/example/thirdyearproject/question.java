package com.example.thirdyearproject;

/*
* Question class transmits information between activies about questions which have been
* generated for students.
* It stores the module and submodule information about a question, also difficulty settings
* once it has been included, and the path to any images required for the question to work
* properly.
* It also stores values about the questions and elements of questions to be displayed.
* */

import java.util.ArrayList;

public class question {

    private int moduleID;
    private int submoduleID;
    private ArrayList<String> questionText;
    private String pictureName;
    private int difficulty;
    private int answer;

    public question() {
        this.moduleID = 0;
        this.submoduleID = 0;
        this.questionText = new ArrayList<String>();
        this.pictureName = "";
        this.difficulty = 0;
        this.answer = 0;
    }

    public question(int moduleID, int submoduleID, ArrayList<String> questionText, String pictureName, int answer) {
        this.moduleID = moduleID;
        this.submoduleID = submoduleID;
        this.questionText = questionText;
        this.pictureName = pictureName;
        this.difficulty = 0;
        this.answer = answer;
    }

    /* Getters for each variable in this class */
    public int getModuleID() { return this.moduleID; }
    public int getSubmoduleID() { return this.submoduleID; }
    public String getQuestionText() {
        String stringQuestionText = "";
        for (int i = 0; i < this.questionText.size(); i++) {
            stringQuestionText = stringQuestionText + this.questionText.get(i);
        }
        return stringQuestionText;
    }
    public String getPictureName() { return this.pictureName; }
    public int getDifficulty() { return this.difficulty; }
    public int getAnswer() { return this.answer; }

    /* No setters as you have no need to change these values once created */

}
