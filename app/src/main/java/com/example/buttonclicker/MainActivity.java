package com.example.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    private int timesClicked;
    private Button buttonClickerButton;
    private TextView textViewScore;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timesClicked = 0;
        buttonClickerButton = findViewById(R.id.button_main_sentience);
        textViewScore = findViewById(R.id.textview_main_score);
        constraintLayout = findViewById(R.id.constraint_layout_main);
    }

    public void onButtonClicked(View view) {
        Toast.makeText(this, "OUCH", Toast.LENGTH_SHORT).show();
        timesClicked++;
         textViewScore.setText("Times Clicked: " + timesClicked);

         changeBackgroundColor();
    }

    private void changeBackgroundColor() {
        int r = 255;
        int g = 255 - timesClicked;
        int b = 255 - timesClicked;

        if (timesClicked > 255)
        {
            g = 0;
            b = 0;
        }

        constraintLayout.setBackgroundColor(rgb(r,g,b));
        textViewScore.setTextColor(rgb(255-r, 255-g, 255-b));
    }
}
