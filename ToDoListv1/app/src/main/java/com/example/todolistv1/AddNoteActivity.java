package com.example.todolistv1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddNoteActivity extends AppCompatActivity {

    //ссылки на элементы activity_add_note.xml
    private EditText editTextNote;
    private RadioButton radioBattonLow;
    private RadioButton radioBattonMedium;
    private RadioButton radioBattonHigh;
    private Button buttonSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        initViews();
        //кнопка "сохранить заметку",слушатель клика
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //создаем отдельный метод для сохранения заметки
                //при клике на кнопу сохранить вызываем метод saveNote()
                //получаем текст (String text=editTextNote.getText().toString().trim();)
                // и приоритет (int priority=getPriority();)
                saveNote();
            }
        });

    }
    //присвоим значение в методе initViews
    private void initViews(){
        editTextNote=findViewById(R.id.editTextNote);
        radioBattonLow=findViewById(R.id.radioBattonLow);
        radioBattonMedium=findViewById(R.id.radioBattonMedium);
        radioBattonHigh=findViewById(R.id.radioBattonHigh);
        buttonSave=findViewById(R.id.buttonSave);
    }
    //отдельный метод для сохранения заметки
    private void saveNote(){
        //Получаем текст из поля ввода
        //toString() - приводит к типу стринг
        //trim() - обрежет пробелы в начале и конце строки
        String text=editTextNote.getText().toString().trim();
        //получаем приоритет из метода getPriority()
        int priority=getPriority();
    }
    //этот метод будет возвращать приоритет (тип int)
    private int getPriority(){
        int priority;
        //проверка какая RadioButton выбрана
        if(radioBattonLow.isChecked()){
            priority=0;
        } else if (radioBattonMedium.isChecked()) {
            priority=1;
        }else {priority=2;}
        return priority;
    }

}