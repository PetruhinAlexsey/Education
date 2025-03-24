package com.example.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewNotes;
    private FloatingActionButton buttonAddNote;
    private NotesAdapter notesAdapter;

    //Коллекция типа Note
//    private ArrayList<Note> notes = new ArrayList<>();
    private Database database = Database.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        notesAdapter=new NotesAdapter();
        

        recyclerViewNotes.setAdapter(notesAdapter);
        ItemTouchHelper itemTouchHelper=new ItemTouchHelper(new ItemTouchHelper.SimpleCallback() {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {

            }
        });


//        Random random = new Random();
//        for (int i = 0; i < 20; i++) {
//            Note note = new Note(i, "Note " + i, random.nextInt(3));
//            notes.add(note);
//        }

//        showNotes();
        buttonAddNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= AddNoteActivity.newIntent(MainActivity.this);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        showNotes();
    }

    private void initViews() {
        recyclerViewNotes = findViewById(R.id.recyclerViewNotes);
        buttonAddNote = findViewById(R.id.buttonAddNote);
    }

    private void showNotes() {

        notesAdapter.setNotes(database.getNotes());

//        //очищаем все записи в linearLayoutNotes
//        linearLayoutNotes.removeAllViews();
//        for (Note note : database.getNotes()) {
//            //преобразование xml-файла во view-элемент
////            getLayoutInflater().inflate(
////       что преобразовать во view   -          R.layout.note_item,
////       куда вставлять данный элемент   -          linearLayoutNotes,
////       всегда передается false     -        false
////            );
//            View view = getLayoutInflater().inflate(
//                    R.layout.note_item,
//                    linearLayoutNotes,
//                    false
//            );
//            view.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    database.remove(note.getId());
//                    showNotes();
//                }
//            });
//            TextView textViewNote = view.findViewById(R.id.textViewNote);
//            textViewNote.setText(note.getText());
//            int colorResId;
//            switch (note.getPriority()) {
//                case 0:
//                    colorResId = android.R.color.holo_green_light;
//                    break;
//                case 1:
//                    colorResId = android.R.color.holo_orange_light;
//                    break;
//                default:
//                    colorResId = android.R.color.holo_red_light;
//            }
//            int color = ContextCompat.getColor(this,colorResId);
//            textViewNote.setBackgroundColor(color);
//            linearLayoutNotes.addView(view);
//        }
    }

}
