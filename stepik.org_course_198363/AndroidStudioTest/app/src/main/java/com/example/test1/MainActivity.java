package com.example.test1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int counter=0;
    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    counter++;
                    textView.setText(Integer.toString(counter));
            }
        });

    }

    void initViews(){
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
    }


}