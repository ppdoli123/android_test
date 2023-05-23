package com.example.myapplication11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Signup_preferenceActivity extends AppCompatActivity {
    private ContextDatabase mydb;
    int num = 0;
    int num1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);

        CheckedTextView ckdTv1 = findViewById(R.id.ckdTv1);
        CheckedTextView ckdTv2 = findViewById(R.id.ckdTv2);

        ckdTv1.setChecked(false);
        ckdTv2.setChecked(false);

        ckdTv1.setClickable(true);
        ckdTv2.setClickable(true);


        View.OnClickListener listner = new View.OnClickListener(){

            @Override
            public void onClick(View view)
            {
                ((CheckedTextView) view).toggle();
            }};

        ckdTv1.setOnClickListener(listner);
        ckdTv2.setOnClickListener(listner);
        Button button7=findViewById(R.id.button6);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}

