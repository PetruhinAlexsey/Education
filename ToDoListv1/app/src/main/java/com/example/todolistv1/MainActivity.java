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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //поле с заметками
//    private LinearLayout linearLayoutNotes;
    //ссылка на RecyclerView
    private RecyclerView recyclerViewNotes;

    //кнопка добавления заметки
    private FloatingActionButton buttonAddNote;

    //ссылка на адаптер
    private NotesAdapter notesAdapter;

    //Экземпляр класса Database, базы данных
    // где храняться тестовые рандомные заметки
     private Database database=Database.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        //присвоим занчение адаптеру
        notesAdapter=new NotesAdapter();
        notesAdapter.setOnNoteClickListener(new NotesAdapter.OnNoteClickListener() {
            @Override
            public void onNoteClick(Note note) {
                database.remove(note.getId());
                showNotes();
            }
        });
        //сказать private RecyclerView recyclerViewNotes какой адаптер применять
        recyclerViewNotes.setAdapter(notesAdapter);

        


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
        recyclerViewNotes=findViewById(R.id.recyclerViewNotes);
        buttonAddNote=findViewById(R.id.buttonAddNote);

    }
    //метод для деманстрации заметок на экране
    private void showNotes(){
        notesAdapter.setNotes(database.getNotes());
    }
}