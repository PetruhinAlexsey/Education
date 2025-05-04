package com.example.todolistv1;

public class Note {
    //поля класса
    private int id;
    //будем отображать это поле
    private String text;
    //поле приоритет,
    // чем выше число тем выше приоритет у этой заметки
    private int priority;
    //Конструктор
    public Note(int id, String text, int priority) {
        this.id = id;
        this.text = text;
        this.priority = priority;
    }
    //Геттеры на все поля
    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getPriority() {
        return priority;
    }
}
