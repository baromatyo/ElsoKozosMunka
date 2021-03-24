package com.example.myapp0323;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gomb1 = findViewById(R.id.gomb1);
        EditText info = findViewById(R.id.edit);
        EditText infoketto  =findViewById(R.id.edit2);
        gomb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NewActivity.class);
                i.putExtra("uzenet", info.getText().toString());
                i.putExtra("key","value");
                startActivity(i);
            }
        });
    }
}