package com.example.cafe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    //константа EXTRA_USER_NAME
    private static final String EXTRA_USER_NAME = "userName";

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
    //текст радиокнопки
    private String radioButton;
    //имя пользователя в переменной экземпляра класса
    //для переноса в следующу активити
    private String userName;

    public static Intent newIntent(Context context, String userName) {
        //фабричный метод
        Intent intent = new Intent(context, MainActivity2.class);
        //передача имени пользователя по ключу
        intent.putExtra(EXTRA_USER_NAME, userName);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initVews();
        putUserName();

        radioGroupTest12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                if (id==rbTest1.getId()){
                    onRbTest1();
                } else if (id==rbTest2.getId()) {
                    onRbTest2();
                }
            }
        });
        rbTest1.setChecked(true);

        buttonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnButtonTest();
            }
        });

    }
    private void clickOnButtonTest(){
        
    }

    private void onRbTest1(){
        radioButton=getString(R.string.radioButtTest1);
        String Test_test1Label=getString(R.string.Test_test1,radioButton);
        textViewTest3.setText(Test_test1Label);
        checktext3.setVisibility(View.VISIBLE);
        spinnerTest1.setVisibility(View.VISIBLE);
        spinnerTest2.setVisibility(View.INVISIBLE);
    }
    private void onRbTest2(){
        radioButton=getString(R.string.radioButtTest2);
        String Test_test1Label=getString(R.string.Test_test1,radioButton);
        textViewTest3.setText(Test_test1Label);
        checktext3.setVisibility(View.INVISIBLE);
        spinnerTest1.setVisibility(View.INVISIBLE);
        spinnerTest2.setVisibility(View.VISIBLE);
    }
    //инициализация элементов активити
    private void initVews() {
        textViewPrivet = findViewById(R.id.textViewPrivet);
        radioGroupTest12 = findViewById(R.id.radioGroupTest12);
        rbTest1 = findViewById(R.id.rbTest1);
        rbTest2 = findViewById(R.id.rbTest2);
        textViewTest3 = findViewById(R.id.textViewTest3);
        checktext1 = findViewById(R.id.checktext1);
        checktext2 = findViewById(R.id.checktext2);
        checktext3 = findViewById(R.id.checktext3);
        spinnerTest1 = findViewById(R.id.spinnerTest1);
        spinnerTest2 = findViewById(R.id.spinnerTest2);
        buttonTest = findViewById(R.id.buttonTest);
    }

    private void putUserName() {
        //новый метод подстановки строки на место плейсхолдера (%s)
        userName = getIntent().getStringExtra(EXTRA_USER_NAME);

        //на место плейсхолдера-%s этот метод вставит userName
        // (то что после запятой в параметрах метода)
        String privet_mudak = getString(R.string.Privet_mudak, userName);
        textViewPrivet.setText(privet_mudak);

        //старый метод подстановки строки на место плейсхолдера (%s)

        // String userName=getIntent().getStringExtra(EXTRA_USER_NAME);
        // String privet_mudak=getString(R.string.Privet_mudak);
        // //на место плейсхолдера-%s этот метод вставит userName
        // // (то что после запятой в параметрах метода)
        // String result=String.format(privet_mudak, userName);
        // textViewPrivet.setText(result);
    }

}