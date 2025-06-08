//Хрнилище всех заметок
//Должна быть возможность хранить, получать и удалять

package com.example.todolistv1;

import java.util.ArrayList;

public class Database {
    //Коллеция новых заметок
    private ArrayList<Note> notes=new ArrayList<>();

    //в коллекцию notes добавляем новый объект note
    private void add(Note note){

        notes.add(note);
    }
    //удаляем заметку по ее id
    public void remove(int id){
        //в этом цикле мы получаем элемент из коллекции notes
        for (int i=0;i< notes.size();i++){
            //сохраняем эелемент в переменную note типа Note
            Note note=notes.get(i);
            if (note.getId()==id){
                //удаляем элемент note из коллекции notes
                notes.remove(note);
            }
        }
    }


}
