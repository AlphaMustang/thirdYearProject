package com.example.thirdyearproject;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class displayQuestion extends AppCompatActivity {

    private Intent intent;
    private question currentQuestion;
    private int correctAnswers;
    private int incorrectAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_question);
        Intent intent = getIntent();
        this.intent = intent;
        changeQuestion(intent);
     }


    public void answerCheck(View view) {
        EditText answerBox = (EditText) findViewById(R.id.answerInput);
        Editable editableAnswer = answerBox.getText();
        String stringAnswer = editableAnswer.toString();
        int intAnswer;
        try {
            intAnswer = Integer.parseInt(stringAnswer);
        } catch (Exception e) {
            intAnswer = -1;
            Intent intent = new Intent(this, displayQuestion.class);
            intent.putExtra("moduleID", intent.getIntExtra("moduleID", 0));
            intent.putExtra("submoduleID", intent.getIntExtra("submoduleID", 0));
            startActivity(intent);
        }
        TextView correctOrNot = (TextView) findViewById(R.id.correctOrNot);

        if ( intAnswer == this.currentQuestion.getAnswer() ) {
            correctOrNot.setText("Correct Answer");
            this.correctAnswers++;
            System.out.println(Integer.toString(this.correctAnswers));
        } else {
            correctOrNot.setText("Incorrect! Correct answer was: " + Integer.toString(this.currentQuestion.getAnswer()) + ".");
            this.incorrectAnswers++;
            System.out.println(Integer.toString(this.incorrectAnswers));
        }
        answerBox.getText().clear();
        changeQuestion(this.intent);
    }

     private void changeQuestion(Intent intent) {
         TextView questionTextBox = (TextView) findViewById(R.id.displayQuestionTextBox);
         int moduleID = intent.getIntExtra("moduleID", 0);
         int submoduleID = intent.getIntExtra("submoduleID", 0);
         int difficultyID = intent.getIntExtra("difficulty", 0);
         System.out.println(Integer.toString(submoduleID));
         question currentQ = new question();
         if (moduleID == 0 && difficultyID == 0 && submoduleID == 0) {
             currentQ = testQuestionGeneration.calculationFoundationQuestion();
         } else if ( moduleID == 0 && difficultyID == 1 && submoduleID == 0) {
             currentQ = testQuestionGeneration.calculationHigherQuestion();
         } else if ( moduleID == 0 && difficultyID == 0 && submoduleID == 1) {
             currentQ = testQuestionGeneration.fractionFoundationQuestion();
         } else if ( moduleID == 0 && difficultyID == 1 && submoduleID == 1) {
             currentQ = testQuestionGeneration.fractionHigherQuestion();
         } else if ( moduleID == 0 && difficultyID == 0 && submoduleID == 2) {
             currentQ = testQuestionGeneration.accuracyFoundationQuestion();
         } else if ( moduleID == 0 && difficultyID == 1 && submoduleID == 2 ) {
             currentQ = testQuestionGeneration.accuracyHigherQuestion();
         } else if (moduleID == 1 && difficultyID == 0) {
             currentQ = testQuestionGeneration.algebraFoundationQuestion();
         } else if (moduleID == 1 && difficultyID == 1) {
             currentQ = testQuestionGeneration.algebraHigherQuestion();
         } else if (moduleID == 2) {
             currentQ = testQuestionGeneration.ratioFoundationQuestion();
         } else if (moduleID == 3) {
            currentQ = testQuestionGeneration.geometryFoundationQuestion();
         } else if (moduleID == 4) {
         currentQ = testQuestionGeneration.probabilityFoundationQuestion();
         } else if (moduleID == 5) {
             currentQ = testQuestionGeneration.statisticsFoundationQuestion();
         }
         else {
             Intent newIntent = new Intent(this, MainActivity.class);
             startActivity(newIntent);
         }
         this.currentQuestion = currentQ;
         String displayedText = currentQ.getQuestionText();
         questionTextBox.setText(displayedText);
         String pictureName = currentQ.getPictureName();
         ImageView image = (ImageView) findViewById(R.id.image);
         if (pictureName.equals("None")) {
             image.setVisibility(View.INVISIBLE);
         } else {
             String imageName = "R.drawable." + pictureName;
             int id = getResources().getIdentifier(pictureName,"drawable",getPackageName());
             image.setImageResource(id);

         }
     }

     public int getCorrectAnswers() { return this.correctAnswers; }
     public int getIncorrectAnswers() { return this.incorrectAnswers; }
}
