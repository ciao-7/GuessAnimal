package com.example.a201124210145guessanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_search;
    EditText edit_intputname;
    DatePicker date_birth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_search = findViewById(R.id.button_search);
        edit_intputname = findViewById(R.id.edit_inputname);
        date_birth = findViewById(R.id.datePicker_birth);

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class );
                intent.putExtra("name",edit_intputname.getText().toString());
                intent.putExtra("year",date_birth.getYear());
                intent.putExtra("month",date_birth.getMonth());
                intent.putExtra("day",date_birth.getDayOfMonth());
                startActivity(intent);
            }
        });
    }
}