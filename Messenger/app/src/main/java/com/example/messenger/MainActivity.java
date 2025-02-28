package com.example.messenger;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextMessage=findViewById(R.id.editTextMessage);
        Button buttonSendMessage=findViewById(R.id.buttonSendMessage);

        buttonSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchNextScreen(editTextMessage.getText().toString());
            }
        });
    }

    private void launchNextScreen(String mes){
        Intent intent=new Intent(this, MesReceived.class);
        intent.putExtra("mes",mes);
        startActivity(intent);
    }
}