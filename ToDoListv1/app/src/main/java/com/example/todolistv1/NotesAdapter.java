package com.example.todolistv1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesViewHolder> {

    private ArrayList<Note> notes=new ArrayList<>();
    private NotesAdapter.OnNoteClickListener onNoteClickListener;

    public void setOnNoteClickListener(OnNoteClickListener onNoteClickListener) {
        this.onNoteClickListener = onNoteClickListener;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
        notifyDataSetChanged();
    }


    //в этом методе надо показать как создавать view из макета
    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(
                R.layout.note_item,
                parent,
                false
        );
        return new NotesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NotesViewHolder viewHolder, int position) {
        Note note=notes.get(position);
        viewHolder.textViewNote.setText(note.getText());
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
        int color= ContextCompat.getColor(viewHolder.itemView.getContext(),colorResId);
        //устанавливаем цвет заметки
        viewHolder.textViewNote.setBackgroundColor(color);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onNoteClickListener!=null){
                    onNoteClickListener.onNoteClick(note);}
            }
        });
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    class NotesViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewNote;
        public NotesViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNote=itemView.findViewById(R.id.textViewNote);
        }
    }
    interface OnNoteClickListener{
        void onNoteClick(Note note);
    }
}
