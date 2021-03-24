package com.example.myapp0323;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        TextView szerkeszt = findViewById(R.id.textview);

        Bundle extras = getIntent().getExtras();

        if(extras != null){
            szerkeszt.setText(extras.getString("uzenet")+extras.getString("key"));
        }


    }
}