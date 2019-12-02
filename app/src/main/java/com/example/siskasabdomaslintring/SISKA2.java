package com.example.siskasabdomaslintring;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SISKA2 extends AppCompatActivity {
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siska2);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
       @Override
        public void onClick(View v) {
            Intent i = new Intent(SISKA2.this,SISKA3.class);
            startActivity(i);
            finish();
        }
    });
}
}
