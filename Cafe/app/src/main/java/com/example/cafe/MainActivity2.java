package com.example.cafe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    //константа
    private static final String EXTRA_USER_NAME="userName";

    private TextView textViewPrivet;

    private RadioGroup radioGroupTest12;
    private RadioButton rbTest1;
    private RadioButton rbTest2;

    private TextView textViewTest3;

    private CheckBox checktext1;
    private CheckBox checktext2;
    private CheckBox checktext3;

    private Spinner spinnerTest1;
    private Spinner spinnerTest2;
    private Button buttonTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initVews();
        String userName=getIntent().getStringExtra(EXTRA_USER_NAME);
        String privet_mudak=getString(R.string.Privet_mudak);
        //на место плейсхолдера-%s этот метод вставит userName
        // (то что после запятой в параметрах метода)
        String result=String.format(privet_mudak, userName);
    }

    public static Intent newIntent(Context context, String userName){
        //фабричный метод
        Intent intent = new Intent(context, MainActivity2.class);
        //передача имени пользователя по ключу
        intent.putExtra(EXTRA_USER_NAME, userName);
        return intent;
    }
    private void initVews(){
        textViewPrivet=findViewById(R.id.textViewPrivet);
        radioGroupTest12=findViewById(R.id.radioGroupTest12);
        rbTest1=findViewById(R.id.rbTest1);
        rbTest2=findViewById(R.id.rbTest2);
        textViewTest3=findViewById(R.id.textViewTest3);
        checktext1=findViewById(R.id.checktext1);
        checktext2=findViewById(R.id.checktext2);
        checktext3=findViewById(R.id.checktext3);
        spinnerTest1=findViewById(R.id.spinnerTest1);
        spinnerTest2=findViewById(R.id.spinnerTest2);
        buttonTest=findViewById(R.id.buttonTest);
    }

}