package com.example.gamescore;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int score1=0;
    private int score2=0;
    TextView textViewTeam1_1;
    TextView textViewTeam2_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTeam1_1=findViewById(R.id.textViewTeam1_1);
        textViewTeam2_2=findViewById(R.id.textViewTeam2_2);

        if (savedInstanceState!=null){
        score1=savedInstanceState.getInt("score1");
        score2=savedInstanceState.getInt("score2");}


        //установка значения переменной score в TextView
        updateScore1();
        updateScore2();

        textViewTeam1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //увеличение счетчика по клику на TextView элемент
                score1++;
                updateScore1();
            }
        });

        textViewTeam2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score2++;
                updateScore2();
            }
        });

    }
    //установка значения переменной score в TextView
    private void updateScore1(){
        textViewTeam1_1.setText(String.valueOf(score1));
    }
    private void updateScore2(){
        textViewTeam2_2.setText(String.valueOf(score2));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("score1",score1);
        outState.putInt("score2",score2);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}