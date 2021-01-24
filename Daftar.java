package com.example.chotabim;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Daftar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        Button dftr = (Button) findViewById(R.id.button);
        dftr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(com.example.chotabim.Daftar.this, com.example.chotabim.Menu.class);
                startActivity(inte);

            }
        });
    }
}
