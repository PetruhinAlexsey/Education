package com.example.todolist;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class AddNoteActivity extends AppCompatActivity {

    private EditText editTextNote;
    private RadioButton radioButtonLow;
    private RadioButton radioButtonMedium;
    private RadioButton radioButtonHigh;
    private Button buttonSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        initViews();
        //слушатель клика
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void initViews() {
        editTextNote = findViewById(R.id.editTextNote);//ctrl+alt+shift - одноврменный курсор
        radioButtonLow = findViewById(R.id.radioButtonLow);//ctrl+alt+shift - одноврменный курсор
        radioButtonMedium = findViewById(R.id.radioButtonMedium);//ctrl+alt+shift - одноврменный курсор
        radioButtonHigh = findViewById(R.id.radioButtonHigh);//ctrl+alt+shift - одноврменный курсор
        buttonSave = findViewById(R.id.buttonSave);//ctrl+alt+shift - одноврменный курсор
    }
    private void saveNote(){
        String text = editTextNote.getText().toString().trim();
    }


}