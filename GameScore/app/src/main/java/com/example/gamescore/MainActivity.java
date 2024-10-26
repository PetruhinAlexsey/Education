package com.example.gamescore;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int score1=0;
    private int score2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewTeam1_1=findViewById(R.id.textViewTeam1_1);
        TextView textViewTeam2_2=findViewById(R.id.textViewTeam2_2);
        //установка значения переменной score в TextView
        textViewTeam1_1.setText(String.valueOf(score1));
        textViewTeam2_2.setText(String.valueOf(score2));

        textViewTeam1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //увеличение счетчика по клику на TextView элемент
                score1++;
                textViewTeam1_1.setText(String.valueOf(score1));
            }
        });

        textViewTeam2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score2++;
                textViewTeam2_2.setText(String.valueOf(score2));
            }
        });

    }
}