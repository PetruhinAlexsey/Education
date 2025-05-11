package com.example.todolistv1;

import android.os.Bundle;
import android.view.View;
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
            //добавляем в коллекцию notes заметку note
            notes.add(note);
        }
        //вызываем метод добавления заметок в linearLayoutNotes
        showNotes();

    }
    //метод инициализации переменных
    private void initViews(){
        linearLayoutNotes=findViewById(R.id.linearLayoutNotes);
        buttonAddNote=findViewById(R.id.buttonAddNote);

    }
    //метод для деманстрации заметок на экране
    private void showNotes(){
        //тип цикла foreach, перебирает note в коллекции notes
        for(Note note:notes){
            //в linearLayoutNotes надо
            // добавить данный макет - note_item.xml
            //но его преобразовать во view элемент
            // с помощью getLayoutInflater()
            //R.layout.note_item - что помещаем (макет note_item.xml)
            //linearLayoutNotes - куда помещаем
            //всегда false третьим параметром (что то про прикрепление)
            //сохраняем в переменную типа View
           View view=getLayoutInflater().inflate(
                   R.layout.note_item,
                   linearLayoutNotes,
                   false
           );
           //помещаем view в linearLayoutNotes
           linearLayoutNotes.addView(view);
        }
    }
}