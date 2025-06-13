package com.example.todolistv1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
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

    //Экземпляр класса Database, базы данных
    // где храняться тестовые рандомные заметки
     private Database database=Database.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        buttonAddNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //запуск AddNoteActivity
                Intent intent=AddNoteActivity.newIntent(MainActivity.this);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
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
        //перед добавлением заметок linearLayoutNotes надо очищать
        linearLayoutNotes.removeAllViews();
        //тип цикла foreach, перебирает note в коллекции notes
        for(Note note:database.getNotes()){
            //в linearLayoutNotes надо
            // добавить данный макет - note_item.xml
            //но его надо преобразовать во view элемент
            // с помощью getLayoutInflater()
            //R.layout.note_item - что помещаем (макет note_item.xml)
            //linearLayoutNotes - куда помещаем
            //всегда false третьим параметром (что то про прикрепление)
            //сохраняем в переменную типа View
                //преобразование к типу View
           View view=getLayoutInflater().inflate(
                   R.layout.note_item,
                   linearLayoutNotes,
                   false
           );
            TextView textViewNote=view.findViewById(R.id.textViewNote);

                textViewNote.setText(note.getText());

                //присваиваем цвет заметке switch case
            //так мы получаем только id цвета
            //сам цвет еще нужно получить
            int colorResId;
                switch (note.getPriority()){
                    //если приоритет 0 то ставим зеленый
                    case 0:colorResId= android.R.color.holo_green_light;
                    break;
                    //если приоритет 1 то ставим желтый
                    case 1:colorResId= android.R.color.holo_orange_light;
                        break;
                    //по умолчанию значение colorResId присваивается красный
                    default:colorResId= android.R.color.holo_red_light;
                }
            //просто посмотреть
            //textViewNote.setText(Integer.toString(colorResId)); - тест, какой id цвета

            //получаем сам цвет
            //в ContextCompat.getColor передаем контекст - this
            //и colorResId - id цвета
            int color= ContextCompat.getColor(this,colorResId);
            //устанавливаем цвет заметки
            textViewNote.setBackgroundColor(color);
           //помещаем view в linearLayoutNotes
           linearLayoutNotes.addView(view);
        }
    }
}