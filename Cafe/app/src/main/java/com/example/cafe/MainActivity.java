package com.example.cafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextPassword;
    private Button buttonInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buttonInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = editTextName.getText().toString().trim();
                String userPass = editTextPassword.getText().toString().trim();

                if (userName.isEmpty() || userPass.isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            getString(R.string.error),
                            Toast.LENGTH_LONG).show();
                } else {
                    nextScreen(userName);
                }
            }
        });
//        Intent intent=new Intent(this, MainActivity3.class);
//        startActivity(intent);
    }

    private void nextScreen(String userName) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("userName", userName);
        startActivity(intent);
    }

    private void initViews() {
        editTextName = findViewById(R.id.editTextName);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonInput = findViewById(R.id.buttonInput);
    }
}