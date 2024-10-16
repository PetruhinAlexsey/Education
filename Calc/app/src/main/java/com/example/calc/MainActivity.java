package com.example.calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextAnswer=findViewById(R.id.editTextAnswer1);
        TextView textViewNoAnswer=findViewById(R.id.textViewNoAnswer);
        TextView textViewYesAnswer=findViewById(R.id.textViewYesAnswer);
        Button buttonOtvet=findViewById(R.id.buttonOtvet);
//Домашнее задание






//        buttonOtvet.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(editTextAnswer.getText().toString().equals("20")){
//                    textViewYesAnswer.setVisibility(View.VISIBLE);
//                    textViewNoAnswer.setVisibility(View.GONE);
//                }else {
//                    textViewNoAnswer.setVisibility(View.VISIBLE);
//                    textViewYesAnswer.setVisibility(View.GONE);
//                }
//            }
//        });

    }
}