package com.example.android.testofchemistry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSubmit(View view) {
        CheckBox checkbox1a = (CheckBox) findViewById(R.id.check_1_a);
        boolean hasCheckBox1a = checkbox1a.isChecked();
        CheckBox checkbox1b = (CheckBox) findViewById(R.id.check_1_b);
        boolean hasCheckBox1b = checkbox1b.isChecked();
        CheckBox checkbox1c = (CheckBox) findViewById(R.id.check_1_c);
        boolean hasCheckBox1c = checkbox1c.isChecked();
        CheckBox checkbox1d = (CheckBox) findViewById(R.id.check_1_d);
        boolean hasCheckBox1d = checkbox1d.isChecked();
        if (hasCheckBox1a) {
            if (hasCheckBox1b) {
                if (hasCheckBox1c) {
                    if (!hasCheckBox1d)
                        score += 4;
                }
            }
        }

        RadioButton radioButton1d = (RadioButton) findViewById(R.id.button_1_d);
        RadioButton radioButton2c = (RadioButton) findViewById(R.id.button_2_c);
        RadioButton radioButton3b = (RadioButton) findViewById(R.id.button_3_b);
        if (radioButton1d.isChecked())
            score += 2;
        if (radioButton2c.isChecked())
            score += 2;
        if (radioButton3b.isChecked())
            score += 2;

        TextView scoreText = (TextView) findViewById(R.id.total_score_text);
        scoreText.setText("总分：" + score);
        if (score == 10) {
            Toast toast = Toast.makeText(this, "Congratulations! All right!", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Unfortunately! Do it again!", Toast.LENGTH_SHORT);
            toast.show();
        }
        score = 0;
    }

    public void showAnswers(View view) {
        TextView textView = (TextView) findViewById(R.id.answer_text);
        textView.setText("1.D 2.C 3.B 4.ABC");
    }
}
