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

     // need to sort out what happens when the app gets closed
    // I don't think this is useful ATM.
//     @Override
//     public void onSaveInstanceState(Bundle savedInstanceState) {
//        super.onSaveInstanceState(savedInstanceState);
//     }


    public void answerCheck(View view) {
        EditText answerBox = (EditText) findViewById(R.id.answerInput);
        Editable editableAnswer = answerBox.getText();
        String stringAnswer = editableAnswer.toString();
        int intAnswer;
        try {
            intAnswer = Integer.parseInt(stringAnswer);
        } catch (Exception e) {
            intAnswer = -1;
            Intent intent = new Intent(this, MainActivity.class);
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
         question currentQ = new question();
         if (moduleID == 0) {
             currentQ = testQuestionGeneration.numberFoundationQuestion();
         } else if (moduleID == 1) {
             currentQ = testQuestionGeneration.algebraFoundationQuestion();
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
