package com.example.cafe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public static Intent newIntent(Context context, String userName){
        //фабричный метод
        Intent intent = new Intent(context, MainActivity2.class);
        //передача имени пользователя по ключу
        intent.putExtra("userName", userName);
        return intent;
    }
}