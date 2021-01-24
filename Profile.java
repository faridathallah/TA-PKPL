package com.example.chotabim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button prfl = (Button) findViewById(R.id.button);
        prfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(com.example.chotabim.Profile.this, com.example.chotabim.Menu.class);
                startActivity(inte);

            }
        });


    }
}