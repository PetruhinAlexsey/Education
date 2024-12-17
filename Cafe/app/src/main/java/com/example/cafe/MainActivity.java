package com.example.cafe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextPassword;
    private Button buttonInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
//        Intent intent=new Intent(this, MainActivity3.class);
//        startActivity(intent);
    }
    private void initViews(){
        editTextName=findViewById(R.id.editTextName);
        editTextPassword=findViewById(R.id.editTextPassword);
        buttonInput=findViewById(R.id.buttonInput);
    }
}