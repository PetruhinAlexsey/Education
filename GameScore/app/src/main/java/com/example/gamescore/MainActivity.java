package com.example.gamescore;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int score1=1;
    private int score2=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewTeam1_1=findViewById(R.id.textViewTeam1_1);
        TextView textViewTeam2_2=findViewById(R.id.textViewTeam2_2);

        textViewTeam1_1.setText(String.valueOf(score1));
        textViewTeam2_2.setText(String.valueOf(score2));

    }
}