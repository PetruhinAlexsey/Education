//Хрнилище всех заметок
//Должна быть возможность хранить, получать и удалять

package com.example.todolistv1;

import java.util.ArrayList;
import java.util.Random;

public class Database {

    //Коллеция новых заметок
    private ArrayList<Note> notes=new ArrayList<>();

    //паттерн проектирования Singleton
    private static Database instance=null;
    public static Database getInstance(){
        if (instance==null){
            instance=new Database();
        }
        return instance;
    }
    //делаем конструктор приватным что бы не было возможности создавать
    //новые экземпляры этого класса без метода getInstance
    private Database() {
        //накидаем в коллекцию notes случайных заметок
        Random random=new Random();
        for (int i=0;i<20;i++){
            Note note=new Note(i,"Заметка"+i, random.nextInt(3));
            //добавляем в коллекцию notes заметку note
            notes.add(note);
        }
    }

    //в коллекцию notes добавляем новый объект note
    public void add(Note note){
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
    //метод getNotes() возвращает тип коллекции ArrayList<Note>
    public ArrayList<Note> getNotes() {
        //заменяем оригинальную коллекцию notes
        // копией new ArrayList<>(notes),
        // для безопасности
        return new ArrayList<>(notes);
    }
}
