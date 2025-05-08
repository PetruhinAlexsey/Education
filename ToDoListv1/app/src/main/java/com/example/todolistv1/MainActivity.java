package com.example.todolistv1;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //поле с заметками
    private LinearLayout linearLayoutNotes;
    //кнопка добавления заметки
    private FloatingActionButton buttonAddNote;

    //Коллеция тестовых заметок Note.java
    private ArrayList<Note> notes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        //накидаем в коллекцию notes случайных заметок
        Random random=new Random();
        for (int i=0;i<20;i++){
            Note note=new Note(i,"Заметка"+i, random.nextInt(3));
            notes.add(note);
        }
    }
    //метод инициализации переменных
    private void initViews(){
        linearLayoutNotes=findViewById(R.id.linearLayoutNotes);
        buttonAddNote=findViewById(R.id.buttonAddNote);

    }
}