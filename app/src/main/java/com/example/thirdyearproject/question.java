package com.example.thirdyearproject;

/*
* Question class transmits information between activies about questions which have been
* generated for students.
* It stores the module and submodule information about a question, also difficulty settings
* once it has been included, and the path to any images required for the question to work
* properly.
* It also stores values about the questions and elements of questions to be displayed.
* */

public class question {

    private int moduleID;
    private int submoduleID;
    private String questionText;
    private String picturePath;
    private int difficulty;

    public question() {
        this.moduleID = 0;
        this.submoduleID = 0;
        this.questionText = "";
        this.picturePath = "";
        this.difficulty = 0;
    }

    public question(int moduleID, int submoduleID, String questionText, String picturePath) {
        this.moduleID = moduleID;
        this.submoduleID = submoduleID;
        this.questionText = questionText;
        this.picturePath = picturePath;
        this.difficulty = 0;
    }

}
