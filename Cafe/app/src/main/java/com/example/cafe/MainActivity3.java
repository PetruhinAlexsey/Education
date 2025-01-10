package com.example.cafe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    private static final String EXTRA_USER_NAME="userName";
    private static final String EXTRA_RADIO_BUTTON="radioButton";
    private static final String EXTRA_TEST_CHECKED="Test1OrTest2Checked";
    private static final String EXTRA_CHECK_BOXES="checkboxes";

    private TextView textView1;


    public static Intent newIntent(Context context,
                                   String userName,
                                   String radioButton,
                                   String Test1OrTest2Checked,
                                   String checkboxes)
    {
        Intent intent=new Intent(context, MainActivity3.class);
        intent.putExtra(EXTRA_USER_NAME,userName);
        intent.putExtra(EXTRA_RADIO_BUTTON,radioButton);
        intent.putExtra(EXTRA_TEST_CHECKED,Test1OrTest2Checked);
        intent.putExtra(EXTRA_CHECK_BOXES,checkboxes);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initViews();
        put();
    }

    private void initViews(){
            textView1=findViewById(R.id.textView1);
    }

    private void put(){
        textView1.setText(getIntent().getStringExtra(EXTRA_USER_NAME));
    }

}